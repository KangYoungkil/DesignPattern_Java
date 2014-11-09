import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive
{
	ImageComponent imageComponent;
	JFrame frame = new JFrame("Sakun Artwork Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable artworks = new Hashtable();

	public static void main(String[] args) throws Exception
	{
		ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
	}

	public void putCdArtWork()
	{
		artworks.put("2013 UNTITLED 58",
				"http://sakun.co.kr/data/board/artwork2013/58s.jpg");
		artworks.put("2013 UNTITLED 57",
				"http://sakun.co.kr/data/board/artwork2013/02tiger02_2.jpg");
		artworks.put("2013 UNTITLED 56",
				"http://sakun.co.kr/data/board/artwork2013/02precious02.jpg");
		artworks.put("2013 UNTITLED 55",
				"http://sakun.co.kr/data/board/artwork2013/02blue02.jpg");
		artworks.put("2013 UNTITLED 54",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW32.jpg");
		artworks.put("2013 UNTITLED 53",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW31.jpg");
		artworks.put("2013 UNTITLED 52",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW30.jpg");
		artworks.put("2013 UNTITLED 51",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW29.jpg");
		artworks.put("2013 UNTITLED 50",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW28.jpg");
		artworks.put("2013 UNTITLED 49",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW27.jpg");
		artworks.put("2013 UNTITLED 48",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW26.jpg");
		artworks.put("2013 UNTITLED 47",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW25.jpg");
		artworks.put("2013 UNTITLED 46",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW24.jpg");
		artworks.put("2013 UNTITLED 45",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW23.jpg");
		artworks.put("2013 UNTITLED 44",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW22.jpg");
		artworks.put("2013 UNTITLED 43",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW21.jpg");
		artworks.put("2013 UNTITLED 42",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW20.jpg");
		artworks.put("2013 UNTITLED 41",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW19.jpg");
		artworks.put("2013 UNTITLED 40",
				"http://sakun.co.kr/data/board/artwork2013/2013-SHOW18.jpg");
	}

	public ImageProxyTestDrive() throws Exception
	{
		putCdArtWork();

		URL initialURL = new URL((String) artworks.get("2013 UNTITLED 50"));
		menuBar = new JMenuBar();
		menu = new JMenu("Sakun Artworks 2013");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);

		for (Enumeration e = artworks.keys(); e.hasMoreElements();)
		{
			String name = (String) e.nextElement();
			JMenuItem menuItem = new JMenuItem(name);
			menu.add(menuItem);
			menuItem.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					imageComponent.setIcon(new ImageProxy(getCDUrl(event
							.getActionCommand())));
					frame.repaint();
				}
			});
		}
		Icon icon = new ImageProxy(initialURL);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);

	}

	URL getCDUrl(String name)
	{
		try
		{
			return new URL((String) artworks.get(name));
		}
		catch (MalformedURLException e)
		{
			e.printStackTrace();
			return null;
		}
	}
}
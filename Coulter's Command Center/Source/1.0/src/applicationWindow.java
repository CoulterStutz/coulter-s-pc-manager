import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;



public class applicationWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicationWindow window = new applicationWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public applicationWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel titleText = new JLabel("                                                Coulter's Command Center");
		frame.getContentPane().add(titleText, BorderLayout.NORTH);
		
		JButton restartButton = new JButton("Restart");
		restartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Runtime runtime = Runtime.getRuntime();
				try {
					Process proc = runtime.exec("shutdown -s -t 25");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
			
		frame.getContentPane().add(restartButton, BorderLayout.WEST);
		
		JButton shutdownButton = new JButton("Shutdown");
		shutdownButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Runtime runtime = Runtime.getRuntime();
				try {
					Process proc = runtime.exec("shutdown -s -t 25");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(shutdownButton, BorderLayout.EAST);
		
		JButton Cancel = new JButton("Cancel");
		Cancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Runtime runtime = Runtime.getRuntime();
				try {
					Process proc = runtime.exec("shutdown -a");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(Cancel, BorderLayout.CENTER);
	}

}

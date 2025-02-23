package JFrame_Obrazovka2;

import javax.swing.Timer;

import JFrame_Obrazovka1.Window;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.SwingConstants;

public class CasKoloZapasu_JPanel extends JPanel {

 	public Timer timer;
	
	private int second, minute;
	String ddSecond, ddMinute;
	
	DecimalFormat dFormat = new DecimalFormat("00");
	
	public JTextField txtKoloZapasu;
	
	public JButton btnClock;
	
	private Window window;
	private Window2 zapas;
	
	private boolean started = false;
	
	/**
	 * Create the panel.
	 */
	public CasKoloZapasu_JPanel(Window window, Window2 zapas) {
		
		this.window = window;
		this.zapas = zapas;
		
		setLayout(null);
		setBackground(Color.WHITE);
		setSize(370, 300);
		
	   //JTextField - text and the number of the ring 	
		txtKoloZapasu = new JTextField();
		txtKoloZapasu.setEditable(false);
		txtKoloZapasu.setHorizontalAlignment(SwingConstants.CENTER);
		txtKoloZapasu.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 36));
		txtKoloZapasu.setForeground(Color.BLACK);
		txtKoloZapasu.setBackground(Color.WHITE);
		txtKoloZapasu.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		txtKoloZapasu.setBounds(110, 110, 150, 40);
		add(txtKoloZapasu);
		
		
	   //JLabel - where the time will count	
		btnClock = new JButton("");
		btnClock.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnClock.setToolTipText("�as z�pasu");
		btnClock.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if ((e.getSource()==btnClock)) {
					if (started == false) {
						started = true;
						Stop();
					} else {
						started = false;
						Start();
					}
				}
			}
		});
		btnClock.setFocusable(false);
		btnClock.setOpaque(true);
		btnClock.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		btnClock.setFont(new Font("Dialog", Font.PLAIN, 135));
		btnClock.setHorizontalAlignment(SwingConstants.CENTER);
		btnClock.setForeground(Color.BLACK);
		btnClock.setBackground(Color.WHITE);
		btnClock.setBounds(10, 150, 350, 150);
		add(btnClock);

		btnClock.setText("00:30");
		countdownTimer();
		
	}

	public void countdownTimer() {
		
		timer = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				second--;
				ddSecond = dFormat.format(getSecond());
				ddMinute = dFormat.format(getMinute());
				btnClock.setText(ddMinute + ":" + ddSecond);
				
				if (second == -1) {
					second = 59;
					minute--;
					ddSecond = dFormat.format(second);
					ddMinute = dFormat.format(minute);
					btnClock.setText(ddMinute + ":" + ddSecond);
				}
				
				if (minute == 0 && second == 0) {
					timer.stop();
				}
				
			}
			
		});
	}
	
	void Start() {
		timer.start();
	}
	
	void Stop() {
		timer.stop();
	}

	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}

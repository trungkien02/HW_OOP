package B1;

import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;

public class MyFrame extends JFrame {
        Calendar calendar;
        SimpleDateFormat timeFormat;
        SimpleDateFormat dayFormat;
        SimpleDateFormat dateFormat;
        JLabel timeLabel;
        JLabel dayLabel;
        JLabel dateLabel;
        String time;
        String day;
        String date;

        MyFrame() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Clock");
            this.setLayout(new FlowLayout());
            this.setSize(350, 150);
            this.setResizable(false);

            timeFormat = new SimpleDateFormat("hh:mm:ss a");
            dayFormat = new SimpleDateFormat("EEEE");
            dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

            timeLabel = new JLabel();
            timeLabel.setFont(new Font("Verdana", Font.PLAIN, 50));
            timeLabel.setForeground(new Color(0xFF0000));
            timeLabel.setBackground(Color.black);
            timeLabel.setOpaque(true);

            dayLabel = new JLabel();
            dayLabel.setFont(new Font("Bold", Font.PLAIN, 25));

            dateLabel = new JLabel();
            dateLabel.setFont(new Font("Bold", Font.PLAIN, 25));

            this.add(timeLabel);
            this.add(dayLabel);
            this.add(dateLabel);
            this.setVisible(true);

            setTime();
        }

        public void setTime() {
            while (true) {
                time = timeFormat.format(Calendar.getInstance().getTime());
                timeLabel.setText(time);

                day = dayFormat.format(Calendar.getInstance().getTime());
                dayLabel.setText(day);

                date = dateFormat.format(Calendar.getInstance().getTime());
                dateLabel.setText(date);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        public static void main(String[] args) {

            new MyFrame();
        }
}

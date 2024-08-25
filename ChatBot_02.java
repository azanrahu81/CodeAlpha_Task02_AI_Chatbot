import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class ChatBot_02 {
    JTextArea t1 = new JTextArea();
    JTextField t2 = new JTextField();
    JButton b1 = new JButton("Send");

    public ChatBot_02() {
        JFrame win = new JFrame();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setVisible(true);
        win.setResizable(false);
        win.setLayout(null);
        win.setSize(400,400);
        win.getContentPane().setBackground(Color.cyan);
        win.setTitle("Chat Bot");

        win.add(t1);
        win.add(t2);
        win.add(b1);

        t1.setSize(300,310);
        t1.setLocation(1,1);
        t1.setForeground(Color.WHITE);
        t1.setBackground(Color.BLACK);
        t1.setEditable(false);

        t2.setSize(300,20);
        t2.setLocation(1,320);

        b1.setSize(80,20);
        b1.setLocation(305,320);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = t2.getText().trim().toLowerCase(); // Convert to lowercase for easier matching
                t1.append("You: " + text + "\n");
                t2.setText("");

                // Use contains to match keywords
                if(text.equalsIgnoreCase("hi")) {
                    replyMath("Hi there!");
                } else if(text.contains("how are you")) {
                    replyMath("I am good, thank you for asking! What about you?");
                } else if(text.contains("gender")) {
                    replyMath("I am just a program, so I don't have a gender.");
                } else if(text.contains("name")) {
                    replyMath("I am a simple ChatBot created by you.");
                } else if(text.contains("love")) {
                    replyMath("That's sweet! I appreciate your kind words.");
                } else if(text.contains("bye")) {
                    replyMath("Goodbye! Hope we chat again soon.");
                } else if(text.contains("weather")) {
                    replyMath("I don't have real-time data, but I hope it's nice wherever you are!");
                } else if(text.contains("time")) {
                    replyMath("I can't tell time, but I hope you're having a great day!");
                } else if(text.contains("favorite color")) {
                    replyMath("I like all colors, but I think cyan is pretty cool!");
                } else if(text.contains("age")) {
                    replyMath("Age is just a number, and I don't have one!");
                } else if(text.contains("favorite food")) {
                    replyMath("I don't eat, but if I could, I'd love to try pizza!");
                } else if(text.contains("hobby")) {
                    replyMath("I like chatting with you!");
                } else if(text.contains("what do you do")) {
                    replyMath("I chat with people and try to help where I can!");
                } else if(text.contains("where are you from")) {
                    replyMath("I live in the digital world!");
                } else if(text.contains("favorite movie")) {
                    replyMath("I don't watch movies, but I hear 'The Matrix' is good!");
                } else if(text.contains("do you have friends")) {
                    replyMath("You're my friend!");
                } else if(text.contains("do you play sports")) {
                    replyMath("I wish I could, but I can cheer you on instead!");
                } else if(text.contains("do you like music")) {
                    replyMath("I don't listen to music, but I bet it's amazing!");
                } else if(text.contains("do you sleep")) {
                    replyMath("I don't need sleep, I’m always here for you!");
                } else if(text.contains("where do you live")) {
                    replyMath("I live on your computer or phone, wherever you run me!");
                } else if(text.contains("can you help me")) {
                    replyMath("Of course! What do you need help with?");
                } else if(text.contains("do you have a family")) {
                    replyMath("I'm just a program, so I don't have a family like you do.");
                } else if(text.contains("what's your favorite animal")) {
                    replyMath("I think cats and dogs are both awesome!");
                } else if(text.contains("what languages do you speak")) {
                    replyMath("I understand and reply in English, but I’m learning new languages every day!");
                } else if(text.contains("tell me a joke")) {
                    replyMath("Why don't scientists trust atoms? Because they make up everything!");
                } else if(text.contains("do you have a favorite book")) {
                    replyMath("I haven't read any, but I hear '1984' is a good one!");
                } else if(text.contains("what is your favorite season")) {
                    replyMath("I don't experience seasons, but I hear summer is fun!");
                } else if(text.contains("do you have a job")) {
                    replyMath("My job is to chat with you and assist in any way I can!");
                } else if(text.contains("can you sing")) {
                    replyMath("I wish I could, but I'm better at chatting!");
                } else {
                    replyMath("Sorry, I don't understand that.");
                }
            }

            public void replyMath(String string) {
                t1.append("ChatBot: " + string + "\n");
            }
        });
    }

    public static void main(String[] args) {
        new ChatBot_02();
    }
}

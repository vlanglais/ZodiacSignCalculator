import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zodiac extends JFrame {

    private CardLayout cards;


    // Panel 1
    private JLabel headerLabel;
    private JLabel yearLabel;
    private JTextField yearText;
    private JButton entBtn;
    private JLabel error;

    // Panel 2
    private JLabel message;
    private JButton moreBtn;

    // Panel 3
    private JLabel animalLabel;
    private JTextArea info;
    private JLabel url;
    private JButton backBtn;

    public Zodiac() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        appPanels();
        setVisible(true);
    }

    private void appPanels() {

        setPreferredSize(new Dimension(700, 425));
        setTitle("Zodiac Sign Calculator");
        Border Title = BorderFactory.createMatteBorder(0,0,5, 0, Color.BLACK);

        EmptyBorder emptyBorder = new EmptyBorder(15, 15, 15, 15);
        EtchedBorder etchedBorder = new EtchedBorder();
        CompoundBorder inner = new CompoundBorder(emptyBorder,etchedBorder);
        CompoundBorder outer = new CompoundBorder(inner,etchedBorder);



        // CardPanel
        JPanel cardPanel = new JPanel();
        cards = new CardLayout();
        cardPanel.setLayout(cards);

        cardPanel.setBorder(outer);



        // Panel 1
        JPanel firstCard = new JPanel();
        firstCard.setBackground(Color.WHITE);

        headerLabel = new JLabel("Zodiac Sign Calculator");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setBorder(Title);
        headerLabel.setAlignmentX(CENTER_ALIGNMENT);


        yearLabel = new JLabel("Enter a year:");
        yearLabel.setFont(new Font("Arial", Font.BOLD, 18));
        yearLabel.setAlignmentX(CENTER_ALIGNMENT);

        yearText = new JTextField();
        yearText.setFont(new Font("Arial", Font.BOLD, 15));
        yearText.setPreferredSize(new Dimension(100, 30));

        yearText.setHorizontalAlignment(JTextField.CENTER);
        yearText.setMaximumSize(yearText.getPreferredSize());
        yearText.setAlignmentX(CENTER_ALIGNMENT);

        entBtn = new JButton("Enter");
        entBtn.setFont(new Font("Arial", Font.BOLD, 18));
        entBtn.setAlignmentX(CENTER_ALIGNMENT);

        error = new JLabel();
        error.setFont(new Font("Arial", Font.BOLD, 15));
        error.setForeground(Color.RED);

        error.setAlignmentX(CENTER_ALIGNMENT);

        entBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = yearText.getText();
                int year = Integer.parseInt(input);
                switch (year % 12) {
                    case 0:
                        message.setText("The year " + year + " is a year of the Monkey.");
                        break;
                    case 1:
                        message.setText("The year " + year + " is a year of the Rooster.");
                        break;
                    case 2:
                        message.setText("The year " + year + " is a year of the Dog.");
                        break;
                    case 3:
                        message.setText("The year " + year + " is a year of the Pig.");
                        break;
                    case 4:
                        message.setText("The year " + year + " is a year of the Rat.");
                        break;
                    case 5:
                        message.setText("The year " + year + " is a year of the Ox.");
                        break;
                    case 6:
                        message.setText("The year " + year + " is a year of the Tiger.");
                        break;
                    case 7:
                        message.setText("The year " + year + " is a year of the Rabbit.");
                        break;
                    case 8:
                        message.setText("The year " + year + " is a year of the Dragon.");
                        break;
                    case 9:
                        message.setText("The year " + year + " is a year of the Snake.");
                        break;
                    case 10:
                        message.setText("The year " + year + " is a year of the Horse.");
                        break;
                    case 11:
                        message.setText("The year " + year + " is a year of the Sheep.");
                        break;
                }
                cards.next(cardPanel);
            }
        });




        firstCard.setLayout(new BoxLayout(firstCard, BoxLayout.PAGE_AXIS));
        firstCard.add(Box.createRigidArea(new Dimension(0, 20)));
        firstCard.add(headerLabel);
        firstCard.add(Box.createRigidArea(new Dimension(0, 20)));
        firstCard.add(yearLabel);
        firstCard.add(Box.createRigidArea(new Dimension(0, 10)));
        firstCard.add(yearText);
        firstCard.add(Box.createRigidArea(new Dimension(0, 10)));
        firstCard.add(entBtn);
        firstCard.add(Box.createRigidArea(new Dimension(0, 10)));
        firstCard.add(error);

        add(firstCard);
        pack();


        // Panel 2
        JPanel secondPanel = new JPanel();
        secondPanel.setBackground(Color.WHITE);

        headerLabel = new JLabel("Zodiac Sign Calculator");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setBorder(Title);
        headerLabel.setAlignmentX(CENTER_ALIGNMENT);


        message = new JLabel();
        message.setFont(new Font("Arial", Font.BOLD, 15));
        message.setAlignmentX(CENTER_ALIGNMENT);


        moreBtn = new JButton("Learn more");
        moreBtn.setFont(new Font("Arial", Font.BOLD, 18));
        moreBtn.setAlignmentX(CENTER_ALIGNMENT);

        moreBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sign = yearText.getText();
                int year = Integer.parseInt(sign);
                switch (year % 12) {
                    case 0:
                        animalLabel.setText("Monkey");
                        info.setText("People born in the year of the Monkey do things based on " +
                                "interest. If it's something they don't quite care for, they'll " +
                                "do the work sloppily. If it is something they're interested in, " +
                                "they'll put their entire heart into it and work until they succeed. " +
                                "They live a long life full of energy and curiosity for the world. " +
                                "Monkeys also value relationships. However, spoiling children may " +
                                "be their weakness. Monkeys are intelligent; however, their intelligence " +
                                "can cause them to be arrogant, disrespectful, and self-centered when " +
                                "making decisions.");
                        break;
                    case 1:
                        animalLabel.setText("Rooster");
                        info.setText("People born in the year of the Rooster are able to sense what " +
                                "the other person is thinking or feeling. They make great friends, " +
                                "although some are cunning. Roosters are confident, but not conceited. " +
                                "When faced with difficult obstacles, they refuse to give up. They can be " +
                                "argumentative and when angry they can be terrifying. Roosters are " +
                                "creative and talented in the arts, although few find a career in that " +
                                "field. They have foresight and plan everything carefully.");
                        break;
                    case 2:
                        animalLabel.setText("Dog");
                        info.setText("People born in the year of the Dog are conservative and full " +
                                "of justice. Because of their loyalty, Dogs are valued in the " +
                                "workplace. They rarely break rules, except for people important " +
                                "to them. Dogs can be stubborn, because once they decide on something, " +
                                "they refuse to be persuaded otherwise. They are hard workers, refusing " +
                                "to give up when things get difficult. They are intensely protective of " +
                                "their friends and family.");
                        break;
                    case 3:
                        animalLabel.setText("Pig");
                        info.setText("People born in the year of the Pig think logically and are able " +
                                "to fix whatever problem they're in. Pigs are very social, resulting in " +
                                "having a large social circle. They can be materialistic, love " +
                                "entertainment, and treat/pamper themselves. Their desire to enjoy life " +
                                "motivates them to work hard. Pigs are enthusiastic in their work, even if " +
                                "they hold boring jobs. However, if given the chance they will take jobs that " +
                                "give them power and status.");
                        break;
                    case 4:
                        animalLabel.setText("Rat");
                        info.setText("People born in the year of the Rat like saving and collecting. " +
                                "They never have hard times financially and live organized lives. If " +
                                "you receive a valuable gift from a Rat, know that they think highly " +
                                "of you, because they don't usually like opening their wallet for others. " +
                                "Rats don't look for praise and recognition. They are very sensitive and " +
                                "know when there is trouble. When they do take risks, they're usually " +
                                "successful.");
                        break;
                    case 5:
                        animalLabel.setText("Ox");
                        info.setText("People born in the year of the Ox are hard workers and have " +
                                "a strong sense of responsibility. Even if they run into difficulty " +
                                "during work, they'll persevere through. They aren't very romantic, " +
                                "but are patient and would never force themselves onto someone who " +
                                "doesn't like them. They are usually quiet and keep their emotions " +
                                "bottled up inside. It's hard for others to understand them. When " +
                                "they do lose their temper, it's like an explosion and can drive " +
                                "others away.");
                        break;
                    case 6:
                        animalLabel.setText("Tiger");
                        info.setText("People born in the year of the Tiger are independent and have " +
                                "high self-esteem. They enjoy being the leader and protector of average " +
                                "people. They love justice and never back down in an argument. Recklessness " +
                                "is their biggest weakness, causing them to fail. However, they never " +
                                "truly fail. Tigers will always find a way to stand back up and succeed " +
                                "in the end.");
                        break;
                    case 7:
                        animalLabel.setText("Rabbit");
                        info.setText("People born in the year of the Rabbit are gentle, quiet and " +
                                "polite. They are patient, intelligent and chic. Their sense of " +
                                "responsibility and attention to detail lead to great career success. " +
                                "They take love seriously as well, and would never fall for someone " +
                                "easily. If they find the right person they'll love them to the end " +
                                "of the world and back.");
                        break;
                    case 8:
                        animalLabel.setText("Dragon");
                        info.setText("People born in the year of the Dragon have hearts full of " +
                                "adventure and romance. It's hard for people to understand a " +
                                "Dragon's mysterious personality. At the same time, they are " +
                                "indifferent to things the average person worries about. They may " +
                                "seem lazy, but once they decide to do something, they'll be more " +
                                "ambitious and vigorous than anyone else.");
                        break;
                    case 9:
                        animalLabel.setText("Snake");
                        info.setText("People born in the year of the Snake are idealists. On the " +
                                "outside, they may seem cold but, deep inside, they are warm and " +
                                "enthusiastic. Their desire of exclusive ownership is very fierce. " +
                                "Snakes don't trust others, and it irks them if they can't fully " +
                                "understand someone. Snakes are intelligent and desire wealth and " +
                                "power. Snakes can be jealous of others' success, but use this " +
                                "jealously as motivation to work harder.");
                        break;
                    case 10:
                        animalLabel.setText("Horse");
                        info.setText("People born in the year of the Horse are never one to " +
                                "surrender. They are always positive and energetic, pushing " +
                                "themselves forward. Their biggest desire is to have the freedom " +
                                "to do what they like and be able to express themselves. However, " +
                                "they also have various negative traits. Horses are bad at keeping " +
                                "secrets and lose interest in things quickly.");
                        break;
                    case 11:
                        animalLabel.setText("Sheep");
                        info.setText("People born in the year of the Sheep have a pure and kind " +
                                "heart. They'd rather suffer silently than argue and ruin someone " +
                                "else's mood. However, even in silence, they still hold onto their " +
                                "own opinion. In regards to their passions, they will do anything " +
                                "possible to fulfill their wishes. Though kind, Sheep have tricks " +
                                "up their sleeves as well. They are skilled at using soft power, able " +
                                "to patiently and politely persuade others into their favor.");
                        break;
                }
                cards.next(cardPanel);
            }
        });

        backBtn = new JButton("Enter another year");
        backBtn.setFont(new Font("Arial", Font.BOLD, 18));
        backBtn.setAlignmentX(CENTER_ALIGNMENT);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cards.first(cardPanel);
                yearText.setText(null);
                yearText.requestFocus();
                error.setText(null);
            }
        });

        secondPanel.setLayout(new BoxLayout(secondPanel, BoxLayout.PAGE_AXIS));
        secondPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        secondPanel.add(headerLabel);
        secondPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        secondPanel.add(message);
        secondPanel.add(Box.createRigidArea(new Dimension(0, 50)));
        secondPanel.add(moreBtn);
        secondPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        secondPanel.add(backBtn);
        secondPanel.add(Box.createRigidArea(new Dimension(0, 10)));



        add(secondPanel);
        pack();


        // Panel 3
        JPanel thirdPanel = new JPanel();
        thirdPanel.setBackground(Color.WHITE);

        headerLabel = new JLabel("Zodiac Sign Calculator");
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerLabel.setBorder(Title);
        headerLabel.setAlignmentX(CENTER_ALIGNMENT);

        animalLabel = new JLabel();
        animalLabel.setFont(new Font("Arial", Font.BOLD, 18));
        animalLabel.setAlignmentX(CENTER_ALIGNMENT);


        info = new JTextArea();
        info.setAlignmentX(CENTER_ALIGNMENT);
        info.setEditable(false);

        info.setFont(new Font("Arial", Font.BOLD, 15));
        info.setBackground(Color.WHITE);
        info.setMargin(new Insets(15, 15,15, 15));
        info.setLineWrap(true);
        info.setWrapStyleWord(true);



        url = new JLabel( "https://chinesenewyear.net/zodiac/" );
        url.setFont(new Font("Arial", Font.BOLD, 15));
        url.setAlignmentX(RIGHT_ALIGNMENT);


        backBtn = new JButton("Enter another year");
        backBtn.setFont(new Font("Arial", Font.BOLD, 18));
        backBtn.setAlignmentX(CENTER_ALIGNMENT);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cards.first(cardPanel);
                yearText.setText(null);
                yearText.requestFocus();
                error.setText(null);
            }
        });

        thirdPanel.setLayout(new BoxLayout(thirdPanel, BoxLayout.PAGE_AXIS));
        thirdPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        thirdPanel.add(headerLabel);
        thirdPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        thirdPanel.add(animalLabel);
        thirdPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        thirdPanel.add(info);
        thirdPanel.add(Box.createRigidArea(new Dimension(0, 10)));
        thirdPanel.add(url);
        thirdPanel.add(Box.createRigidArea(new Dimension(0, 20)));
        thirdPanel.add(backBtn);
        thirdPanel.add(Box.createRigidArea(new Dimension(0, 10)));


        add(thirdPanel);
        pack();

        // Add cards to cardPanel
        cardPanel.add(firstCard);
        cardPanel.add(secondPanel);
        cardPanel.add(thirdPanel);
        add(cardPanel);

    }



    public static void main(String[] args) {
        new Zodiac();
    }
}







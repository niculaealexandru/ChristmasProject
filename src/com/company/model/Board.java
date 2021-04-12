package com.company.model;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Board {
    JFrame frame;
    ImageIcon christmasIcon;
    JLabel myLabel;
    JButton colind1Button;
    JButton colind2Button;
    JButton colind3Button;
    JButton colind4Button;
    JButton colind5Button;
    JButton colind6Button;
    JButton colind7Button;
    JButton colind8Button;
    JButton colind9Button;
    JButton intoarcereButton;
    JButton exitButton;
    JButton versuriButton;
    JButton vers1Button;
    JButton vers2Button;
    JButton vers3Button;
    JButton vers4Button;
    JButton vers5Button;
    JButton vers6Button;
    JButton vers7Button;
    JButton vers8Button;
    JButton vers9Button;
    ImageIcon craciun;
    JLabel cr;

    public Board() {

        File domn = new File("src\\com\\resource\\domn.wav");
        File clopotei = new File("src\\com\\resource\\clopotei.wav");
        File colindatori = new File("src\\com\\resource\\colindatori.wav");
        File hristos = new File("src\\com\\resource\\hristos.wav");
        File colindita = new File("src\\com\\resource\\colindita.wav");
        File deschideUsa = new File("src\\com\\resource\\deschideUsa.wav");
        File mosCraciun = new File("src\\com\\resource\\mosCraciun.wav");
        File saniuta = new File("src\\com\\resource\\saniuta.wav");
        File steaua = new File("src\\com\\resource\\steaua.wav");



        christmasIcon = new ImageIcon("src\\com\\resource\\background.jpg");
        myLabel = new JLabel(christmasIcon);
        myLabel.setSize(600, 800);

        craciun = new ImageIcon("src\\com\\resource\\craciunFericit.png");
        cr = new JLabel(craciun);
        cr.setBounds(50,100,500,60);


        frame = new JFrame("Craciun Fericit!");
        frame.add(cr);
        frame.add(myLabel);
        frame.setSize(600, 800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);





        JButton colindeButton = new JButton("Colinde");
        colindeButton.setBounds(93, 300, 400, 100);
        colindeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButton.setVisible(false);
                colindeButton.setVisible(false);
                versuriButton.setVisible(false);
                setVisibleTrue();
            }
        });
        myLabel.add(colindeButton);

        versuriButton = new JButton("Versuri");
        versuriButton.setBounds(93, 450, 400, 100);
        versuriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exitButton.setVisible(false);
                colindeButton.setVisible(false);
                versuriButton.setVisible(false);
                setVisibleVersTrue();
                intoarcereButton.setVisible(true);

            }
        });
        myLabel.add(versuriButton);

        intoarcereButton = new JButton("Inapoi");
        intoarcereButton.setBounds(50, 680, 100, 50);
        intoarcereButton.setVisible(false);
        intoarcereButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                exitButton.setVisible(true);
                colindeButton.setVisible(true);
                versuriButton.setVisible(true);
                setVisibleFalse();
                setVisibleVersFalse();


            }
        });
        myLabel.add(intoarcereButton);

        exitButton = new JButton("Iesire");
        exitButton.setBounds(450, 670, 100, 50);
        exitButton.setVisible(true);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
        myLabel.add(exitButton);

        colind1Button = new JButton("Domn, Domn sa-naltam!");
        colind1Button.setBounds(93, 200, 400, 30);
        colind1Button.setVisible(false);
        colind1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(domn);
            }
        });
        myLabel.add(colind1Button);


        colind2Button = new JButton("Astazi s-a nascut Hristos!");
        colind2Button.setBounds(93, 250, 400, 30);
        colind2Button.setVisible(false);
        colind2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(hristos);
            }
        });

        myLabel.add(colind2Button);

        colind3Button = new JButton("Colindita!");
        colind3Button.setBounds(93, 300, 400, 30);
        colind3Button.setVisible(false);
        colind3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(colindita);
            }
        });
        myLabel.add(colind3Button);

        colind4Button = new JButton("Iata Vin Colindatori, Florile Dalbe!");
        colind4Button.setBounds(93, 350, 400, 30);
        colind4Button.setVisible(false);
        colind4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(colindatori);

            }
        });
        myLabel.add(colind4Button);

        colind5Button = new JButton("Saniuta Fuge!");
        colind5Button.setBounds(93, 400, 400, 30);
        colind5Button.setVisible(false);
        colind5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(saniuta);
            }
        });
        myLabel.add(colind5Button);

        colind6Button = new JButton("Mos Craciun cu plete dalbe!");
        colind6Button.setBounds(93, 450, 400, 30);
        colind6Button.setVisible(false);
        colind6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(mosCraciun);
            }
        });
        myLabel.add(colind6Button);

        colind7Button = new JButton("Deschide Usa Crestine!");
        colind7Button.setBounds(93, 500, 400, 30);
        colind7Button.setVisible(false);
        colind7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(deschideUsa);
            }
        });
        myLabel.add(colind7Button);

        colind8Button = new JButton("Clopoței, clopoței (Jingle Bells)!");
        colind8Button.setBounds(93, 550, 400, 30);
        colind8Button.setVisible(false);
        colind8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(clopotei);
            }
        });
        myLabel.add(colind8Button);

        colind9Button = new JButton("Steaua sus răsare!");
        colind9Button.setBounds(93, 600, 400, 30);
        colind9Button.setVisible(false);
        colind9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSound(steaua);
            }
        });
        myLabel.add(colind9Button);

        vers1Button = new JButton("Domn, Domn sa-naltam versuri!");
        vers1Button.setBounds(93, 200, 400, 30);
        vers1Button.setVisible(false);
        vers1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(domn, "Am plecat sa colindam\n" +
                        "Domn, Domn sa-naltam!\n" +
                        "Cand boierii nu-s acasa.\n" +
                        "Domn, Domn sa-naltam! [x 2]\n" +
                        "\n" +
                        "Si-au plecat la vanatoare\n" +
                        "Domn, Domn sa-naltam!\n" +
                        "Sa vaneze caprioare.\n" +
                        "Domn, Domn sa-naltam! [x 2]\n" +
                        "\n" +
                        "Caprioare n-au vanat\n" +
                        "Domn, Domn sa-naltam!\n" +
                        "Si-au vanat un iepuras\n" +
                        "Domn, Domn sa-naltam! [x 2]\n" +
                        "\n" +
                        "Sa faca din blana lui\n" +
                        "Domn, Domn sa-naltam!\n" +
                        "Vesmant frumos Domnului.\n" +
                        "Domn, Domn sa-naltam! [x 2");


            }
        });
        myLabel.add(vers1Button);


        vers2Button = new JButton("Astazi s-a nascut Hristos!");
        vers2Button.setBounds(93, 250, 400, 30);
        vers2Button.setVisible(false);
        vers2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(hristos,
                        "Astăzi s-a nascut Hristos,\n" +
                                "Mesia chip luminos\n" +
                                "Laudați și cântați,\n" +
                                "Și vă bucurați!\n" +
                                "\n" +
                                "Mititel, înfășetel ,\n" +
                                "În scutec de bumbăcel,\n" +
                                "Laudăți și cântați,\n" +
                                "Și vă bucurați!\n" +
                                "\n" +
                                "Vântul bate, nu-l răzbate,\n" +
                                "Neaua ninge, nu-l atinge,\n" +
                                "Lăudați și cântați,\n" +
                                "Și vă bucurați!\n" +
                                "\n" +
                                "Și de acum până-n vecie,\n" +
                                "Mila Domnului să fie,\n" +
                                "Laudați și cântați,\n" +
                                "Și vă bucurați!");
            }
        });

        myLabel.add(vers2Button);

        vers3Button = new JButton("Colindita!");
        vers3Button.setBounds(93, 300, 400, 30);
        vers3Button.setVisible(false);
        vers3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(colindita,
                        "Colindita nu-i mai multa,\n" +
                                "Sa traiasca cine-asculta,\n" +
                                "Sus la ceruri o-naltam\n" +
                                "Si la gazde o-nchinam.\n" +
                                "O-nchinam cu veselie\n" +
                                "Si cu mare bucurie,\n" +
                                "C-am ajuns seara de-Ajun\n" +
                                "A batranului Craciun.\n" +
                                "Sus mai sus v-am inaltat,\n" +
                                "Ce-am stiut noi v-am cantat.\n" +
                                "Sa ramaneti sanatosi,\n" +
                                "Sanatosi si bucurosi,\n" +
                                "C-am ajuns ziua cea sfanta\n" +
                                "Cand colindele se canta.\n" +
                                "Sarbatoarea lui Hristos\n" +
                                "Sa va fie de folos\n" +
                                "Sa va fie de folos…");

            }
        });
        myLabel.add(vers3Button);

        vers4Button = new JButton("Iata Vin Colindatori, Florile Dalbe!");
        vers4Button.setBounds(93, 350, 400, 30);
        vers4Button.setVisible(false);
        vers4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(colindatori,
                        "Iată vin colindatori,\n" +
                                "Florile dalbe,\n" +
                                "Noaptea pe la cântători,\n" +
                                "Florile dalbe.\n" +
                                "\n" +
                                "Şi ei vin mereu, mereu,\n" +
                                "Florile dalbe,\n" +
                                "Şi-l aduc pe Dumnezeu,\n" +
                                "Florile dalbe.\n" +
                                "\n" +
                                "Dumnezeu adevărat,\n" +
                                "Florile dalbe,\n" +
                                "Soare-n raze luminat.\n" +
                                "Florile dalbe, florile dalbe.");

            }
        });
        myLabel.add(vers4Button);

        vers5Button = new JButton("Saniuta Fuge!");
        vers5Button.setBounds(93, 400, 400, 30);
        vers5Button.setVisible(false);
        vers5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(saniuta,
                        "Săniuța fuge, nimeni n-o ajunge\n" +
                                "Are dor de ducă parcă ar fi nălucă.\n" +
                                "\n" +
                                "Toată ziua prin zăpadă\n" +
                                "Vine lumea sa o vadă\n" +
                                "Săniuța e ușoară fuge parcă zboară.\n" +
                                "\n" +
                                "Are tălpi lucioase, vârfurile-ntoarse,\n" +
                                "Pod de scândurele să tot stai pe ele.\n" +
                                "\n" +
                                "Toată ziua prin zăpada\n" +
                                "Vine lumea să o vadă\n" +
                                "Săniuța e ușoară fuge parcă zboară.\n" +
                                "\n" +
                                "Peste hopuri sare, ca pe zmeu calare\n" +
                                "Hățul de-o sa-ți scape, trânta e aproape.\n" +
                                "\n" +
                                "Toată ziua prin zăpada\n" +
                                "Vine lumea să o vadă\n" +
                                "Săniuța e ușoară fuge parcă zboară.");

            }
        });
        myLabel.add(vers5Button);

        vers6Button = new JButton("Mos Craciun cu plete dalbe!");
        vers6Button.setBounds(93, 450, 400, 30);
        vers6Button.setVisible(false);
        vers6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(mosCraciun,
                        "Moş Crăciun cu plete dalbe\n" +
                                "A sosit de prin nămeţi\n" +
                                "Şi aduce daruri multe\n" +
                                "La fetiţe şi băieţi\n" +
                                "\n" +
                                "Moş Crăciun, Moş Crăciun\n" +
                                "\n" +
                                "Din bătrani se povesteşte\n" +
                                "Că-n toţi anii negreşit\n" +
                                "Moş Crăciun pribeag soseşte\n" +
                                "Niciodată n-a lipsit\n" +
                                "\n" +
                                "Moş Crăciun, Moş Crăciun\n" +
                                "\n" +
                                "Moş Crăciun cu plete dalbe\n" +
                                "Incotro vrei s-o apuci\n" +
                                "Ţi-aş canta Florile dalbe\n" +
                                "De la noi să nu te duci!\n" +
                                "\n" +
                                "Moş Crăciun, Moş Crăciun!");

            }
        });
        myLabel.add(vers6Button);

        vers7Button = new JButton("Deschide Usa Crestine!");
        vers7Button.setBounds(93, 500, 400, 30);
        vers7Button.setVisible(false);
        vers7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(deschideUsa,
                        "Deschide usa crestine\n" +
                                "Ca venim din nou la tine\n" +
                                "Drumu-i lung si-am obosit\n" +
                                "De departe am venit.\n" +
                                "\n" +
                                "Si la Viflaeem am fost\n" +
                                "Unde S-a nascut Hristos,\n" +
                                "Si-am vazut pe-a Sa mama\n" +
                                "Pe care Maria-o cheama.\n" +
                                "\n" +
                                "Cum umbla din casa-n casa\n" +
                                "Ca pe fiul ei sa nasca.\n" +
                                "Umbla-n sus si umbla-n jos\n" +
                                "Ca sa nasca pe Hristos.\n" +
                                "\n" +
                                "Umbla-n jos si umbla-n sus\n" +
                                "Ca sa nasca pe Iisus,\n" +
                                "Mai tarziu gasi apoi\n" +
                                "Un staul frumos de oi.\n" +
                                "\n" +
                                "Si acolo pe fan jos\n" +
                                "S-a nascut Domnul Hristos\n" +
                                "Cete de ingeri coboara\n" +
                                "Staulul de-l inconjoara.\n" +
                                "\n" +
                                "Ingerii cu flori in mana\n" +
                                "Impletesc mandra cununa\n" +
                                "Pe cununa-i scris frumos\n" +
                                "\"Astazi s-a nascut Hristos!\"\n" +
                                "\n" +
                                "Care cu puterea Sa\n" +
                                "Mantui-va El lumea\n" +
                                "Si-de acum pana-n vecie\n" +
                                "Mila Domnului sa fie\n" +
                                "Tuturor cu bucurie!");

            }
        });
        myLabel.add(vers7Button);

        vers8Button = new JButton("Clopoței, clopoței (Jingle Bells)!");
        vers8Button.setBounds(93, 550, 400, 30);
        vers8Button.setVisible(false);
        vers8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(clopotei,
                        "Cling, cling, cling, cling, cling, cling,\n" +
                                "Răsună clopoței\n" +
                                "Vine Moș Crăciun acum,\n" +
                                "Se-aude de pe drum, hei!\n" +
                                "\n" +
                                "Cling, cling, cling, a sosit\n" +
                                "Moșul a venit!\n" +
                                "Să-i cântăm, să-i dansăm!\n" +
                                "Toți să-l bucurăm!\n" +
                                "\n" +
                                "Un an am așteptat Crăciunul minunat,\n" +
                                "Bradu-mpodobit azi l-am pregătit\n" +
                                "Fulgii cad ușor, copiii cântă-n cor\n" +
                                "Și așteaptă cuminței s-audă clopoței, hei!\n" +
                                "\n" +
                                "Cling, cling, cling, cling, cling, cling,\n" +
                                "Răsună clopoței\n" +
                                "Vine Moș Crăciun acum,\n" +
                                "Se-aude de pe drum, hei!\n" +
                                "\n" +
                                "Cling, cling, cling, a sosit\n" +
                                "Moșul a venit!\n" +
                                "Să-i cântăm, să-i dansăm!\n" +
                                "Toți să-l bucurăm!\n" +
                                "\n" +
                                "Să-i cântăm, să-i dansăm!\n" +
                                "Toți să-l bucurăm!");

            }
        });
        myLabel.add(vers8Button);

        vers9Button = new JButton("Steaua sus răsare!");
        vers9Button.setBounds(93, 600, 400, 30);
        vers9Button.setVisible(false);
        vers9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Sound.playSoundStop(steaua,
                        "Steaua sus răsare\n" +
                                "Ca o taină mare\n" +
                                "Steaua strălucește\n" +
                                "Și lumii vestește\n" +
                                "Și lumii vestește\n" +
                                "\n" +
                                "Ca astăzi Curata\n" +
                                "Preanevinovata\n" +
                                "Fecioara Maria\n" +
                                "Naște pe Mesia\n" +
                                "Naște pe Mesia\n" +
                                "\n" +
                                "Magii cum zăriră\n" +
                                "Steaua și porniră\n" +
                                "Mergând după rază\n" +
                                "Pe Hristos sa-l vază\n" +
                                "Pe Hristos sa-l vază\n" +
                                "\n" +
                                "Și dacă porniră\n" +
                                "Îndată-L găsiră\n" +
                                "La Dansul intrară\n" +
                                "Și se închinară\n" +
                                "Și se închinară\n" +
                                "\n" +
                                "Cu daruri gătite\n" +
                                "Lui Hristos menite\n" +
                                "Ducând fiecare\n" +
                                "Bucurie mare\n" +
                                "Bucurie mare\n" +
                                "\n" +
                                "Care bucurie\n" +
                                "Și aici sa fie\n" +
                                "De la tinerețe\n" +
                                "Pan-la bătrânețe\n" +
                                "Pan-la bătrânețe");

            }
        });
        myLabel.add(vers9Button);
    }

    private void setVisibleFalse() {
        colind1Button.setVisible(false);
        colind2Button.setVisible(false);
        colind3Button.setVisible(false);
        colind4Button.setVisible(false);
        colind5Button.setVisible(false);
        colind6Button.setVisible(false);
        colind7Button.setVisible(false);
        colind8Button.setVisible(false);
        colind9Button.setVisible(false);
        intoarcereButton.setVisible(false);
    }

    private void setVisibleTrue() {
        colind1Button.setVisible(true);
        colind2Button.setVisible(true);
        colind3Button.setVisible(true);
        colind4Button.setVisible(true);
        colind5Button.setVisible(true);
        colind6Button.setVisible(true);
        colind7Button.setVisible(true);
        colind8Button.setVisible(true);
        colind9Button.setVisible(true);
        intoarcereButton.setVisible(true);
    }

    public void setVisibleVersFalse() {
        vers1Button.setVisible(false);
        vers2Button.setVisible(false);
        vers3Button.setVisible(false);
        vers4Button.setVisible(false);
        vers5Button.setVisible(false);
        vers6Button.setVisible(false);
        vers7Button.setVisible(false);
        vers8Button.setVisible(false);
        vers9Button.setVisible(false);
    }

    public void setVisibleVersTrue() {
        vers1Button.setVisible(true);
        vers2Button.setVisible(true);
        vers3Button.setVisible(true);
        vers4Button.setVisible(true);
        vers5Button.setVisible(true);
        vers6Button.setVisible(true);
        vers7Button.setVisible(true);
        vers8Button.setVisible(true);
        vers9Button.setVisible(true);
    }
}



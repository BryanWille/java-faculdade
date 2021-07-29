package meutestecelular;
import javax.swing.JOptionPane;

public class Xiaomi implements Smartphone{
    private final String msg;
    private int volume;
    private boolean turn;
    private boolean blocked;
    private String password;

    public Xiaomi(String password){
        this.msg = "Yours Xiaomi Phone Menu";
        this.setPassword(password);
        this.setVolume(0);
        this.setTurn(false);
        this.setBlocked(true);
    }

    public void whatsapp(){
        JOptionPane.showMessageDialog(null, "Looking your messages!",
                this.msg, JOptionPane.INFORMATION_MESSAGE);
        this.defaultButtons();
    }

    public void twitter(){
        JOptionPane.showMessageDialog(null, "Looking your feed");
        this.defaultButtons();
    }

    public void youtube(){
        JOptionPane.showMessageDialog(null, "Looking your videos");
        this.defaultButtons();
    }

    public void googleChrome(){
        JOptionPane.showMessageDialog(null, "Looking your sites or search");
        this.defaultButtons();
    }

    @Override
    public void turnButton(){
        if(this.isTurn()){
            String[] option = {"cancel", "turn off"};
            int index = JOptionPane.showOptionDialog(null, "Do you want to turn off?",
                    this.msg, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, option[0]);
            if (index == 0){
               JOptionPane.showMessageDialog(null, "Ok! keeping your device on",
                       this.msg, JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Turned off",
                        this.msg, JOptionPane.INFORMATION_MESSAGE);
                this.setTurn(false);
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Turning Smartphone On",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
            this.setTurn(true);
            this.unblock();
        }
    }

    @Override
    public void unblock(){
        if(!isBlocked()){
            JOptionPane.showMessageDialog(null,"Your phone is already unblocked!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
            this.mainMenu();
        } else if (this.isBlocked() && this.isTurn()){
            String userPass;
            do {
                userPass = JOptionPane.showInputDialog(null, "Put your password",
                        this.msg, JOptionPane.QUESTION_MESSAGE);
            } while (!userPass.equals(this.getPassword()));
                JOptionPane.showMessageDialog(null, "Phone Unblocked!",
                        this.msg, JOptionPane.INFORMATION_MESSAGE);
                this.setBlocked(false);
                this.mainMenu();
            } else {
            JOptionPane.showMessageDialog(null, "Turn your smartphone first!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void increaseVol(){
        if(this.getVolume() < 100){
            JOptionPane.showMessageDialog(null, "Increasing volume!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
            if(this.getVolume() + 5 > 100){
                JOptionPane.showMessageDialog(null, "Max volume reached!");
                this.setVolume(100);
            } else {
                this.setVolume(getVolume() + 5);
                JOptionPane.showMessageDialog(null, "Your volume: " +this.getVolume(),
                        this.msg, JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Phone is already on the max volume");
        }
    }

    @Override
    public void decreaseVol(){
        if(this.getVolume() > 0){
            JOptionPane.showMessageDialog(null, "Decreasing volume!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
            if(this.getVolume() - 5 < 0){
                JOptionPane.showMessageDialog(null, "Minimum volume already reached!");
            } else {
                this.setVolume(getVolume() - 5);
                JOptionPane.showMessageDialog(null, "Your volume: " +this.getVolume(),
                        this.msg, JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Yours phone is already muted!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void homeButton(){
        if(!this.isBlocked()){
            JOptionPane.showMessageDialog(null, "Returning to main menu",
                    this.msg ,JOptionPane.INFORMATION_MESSAGE);
            this.mainMenu();
        } else {
            JOptionPane.showMessageDialog(null, "You must first unblock your phone!");
            this.unblock();
        }
    }

    @Override
    public void mainMenu(){
        if(!this.isBlocked() || this.isTurn()) {
            String[] options = {"Turn off", "Increase Volume", "Decrease Volume", "Home", "Open Apps"};
            int index;
            do {
                index = JOptionPane.showOptionDialog(null, "What do you want?",
                        this.msg, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
                switch (index) {
                    case 0:
                        this.turnButton();
                        break;
                    case 1:
                        this.increaseVol();
                        break;
                    case 2:
                        this.decreaseVol();
                        break;
                    case 3:
                        this.homeButton();
                        break;
                    case 4:
                        this.openApps();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Wrong option try again",
                                this.msg, JOptionPane.INFORMATION_MESSAGE);
                        break;
                }
            } while (index != 0);
        } else if (this.isBlocked() && this.isTurn()){
            JOptionPane.showMessageDialog(null, "Phone blocked, unlock first!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
            this.unblock();
        } else if(!this.isTurn()){
            JOptionPane.showMessageDialog(null, "Turn your phone first!",
                    this.msg, JOptionPane.INFORMATION_MESSAGE);
            this.turnButton();
        }
    }

    @Override
    public void openApps(){
        String[] options = {"Home", "Whatsapp", "Twitter", "Youtube", "Google Chrome"};
        int index;
            index = JOptionPane.showOptionDialog(null, "What app do you want to open?",
                    this.msg, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch (index){
                case 0:
                    this.homeButton();
                    break;
                case 1:
                    this.whatsapp();
                    break;
                case 2:
                    this.twitter();
                    break;
                case 3:
                    this.youtube();
                    break;
                case 4:
                    this.googleChrome();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Wrong option!",
                            this.msg, JOptionPane.INFORMATION_MESSAGE);
            }
    }

    @Override
    public void defaultButtons(){
        String[] options = {"Turn off", "Increase Volume", "Decrease Volume", "Home"};
        int index;
        index = JOptionPane.showOptionDialog(null, "What do you want?",
                this.msg, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        switch (index) {
            case 0:
                this.turnButton();
                break;
            case 1:
                this.increaseVol();
                break;
            case 2:
                this.decreaseVol();
                break;
            case 3:
                this.homeButton();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong option try again",
                        this.msg, JOptionPane.INFORMATION_MESSAGE);
                break;
        }
    }


    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int v){
        this.volume = v;
    }

    public boolean isTurn(){
        return this.turn;
    }
    public void setTurn(boolean l){
        this.turn = l;
    }

    public boolean isBlocked(){
        return this.blocked;
    }
    public void setBlocked(boolean b){
        this.blocked = b;
    }

    private String getPassword(){
        return this.password;
    }
    private void setPassword(String l){
        this.password = l;
    }
}

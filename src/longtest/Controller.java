/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longtest;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.input.*;
import javafx.scene.shape.Rectangle;

/**
 * HASH KEY FOR THIS SECTION: 734c1d1f4d9bff981d04aeac41b5e91b.
 * @author cctjallorina
 */
public class Controller implements Initializable {
    
    /* Code in this segment belongs to the programming problem on COUNTER
     ____  ____  _     _      _____  _____ ____ 
    /   _\/  _ \/ \ /\/ \  /|/__ __\/  __//  __\
    |  /  | / \|| | ||| |\ ||  / \  |  \  |  \/|
    |  \__| \_/|| \_/|| | \||  | |  |  /_ |    /
    \____/\____/\____/\_/  \|  \_/  \____\\_/\_\
    */
    
    @FXML private Label lblCounter;
    
    /**
     * Invokes the same convenience methods for pressing the plus and reset
     * buttons on the display.
     * @param ke determines the pressed key
     */
    @FXML public void counterKeyPress(KeyEvent ke) {
        if(null != ke.getCode()) {
            switch (ke.getCode()) {
                case ESCAPE:
                    counterReset();
                    break;
                case UP:
                    counterUp();
                    break;
            }
        }
    }
    
    @FXML public void counterUp() {
        int oldValue = Integer.parseInt(lblCounter.getText());
        // TODO
        // Update the Label lblCounter with the next integer.
        int newValue = oldValue + 1;
        lblCounter.setText(String.valueOf(newValue));
    }
    
    @FXML public void counterReset() {
        // Reset the counter back to 0.
        lblCounter.setText("0");
    }
    
    /* Code in this segment belongs to the programming problem on TEMPERATURE
        _____  _____ _      ____  _____ ____  ____  _____  _     ____  _____
       /__ __\/  __// \__/|/  __\/  __//  __\/  _ \/__ __\/ \ /\/  __\/  __/
         / \  |  \  | |\/|||  \/||  \  |  \/|| / \|  / \  | | |||  \/||  \  
         | |  |  /_ | |  |||  __/|  /_ |    /| |-||  | |  | \_/||    /|  /_ 
         \_/  \____\\_/  \|\_/   \____\\_/\_\\_/ \|  \_/  \____/\_/\_\\____\
    */
    
    @FXML private TextField tempC;
    @FXML private TextField tempF;
    
    @FXML public void convertCToF() {
        // TODO
        // Write the method to display the temperature in F from C.
    }
    
    @FXML public void convertFToC() {
        // TODO
        // Write the method to display the temperature in C from F.
    }
    
    /* Code in this segment belongs to the programming problem on ADDING MACHINE
        ____  ____  ____  _  _      _____   _      ____  ____  _     _  _      _____
       /  _ \/  _ \/  _ \/ \/ \  /|/  __/  / \__/|/  _ \/   _\/ \ /|/ \/ \  /|/  __/
       | / \|| | \|| | \|| || |\ ||| |  _  | |\/||| / \||  /  | |_||| || |\ |||  \  
       | |-||| |_/|| |_/|| || | \||| |_//  | |  ||| |-|||  \_ | | ||| || | \|||  /_ 
       \_/ \|\____/\____/\_/\_/  \|\____\  \_/  \|\_/ \|\____/\_/ \|\_/\_/  \|\____\
    */
    
    @FXML private TextField addend1;
    @FXML private TextField addend2;
    @FXML private TextField sum;
    
    @FXML public void displaySum() {
        // TODO
        // Compute for the sum based on the input from the two TextFields
        // addend1 and addend2.
        //
        // If an Exception is encountered, display "Invalid" in the TextField
        // sum.
        
        try {
            sum.setText(Double.parseDouble((addend1.getText()) + Double.parseDouble(addend2.getText())) + "");
        }
        catch (Exception e) {
            sum.setText("Invalid");
        }
    }
    
    /* Code in this segment belongs to the programming problem on FACTORIAL
        _____ ____  ____  _____  ____  ____  _  ____  _    
       /    //  _ \/   _\/__ __\/  _ \/  __\/ \/  _ \/ \   
       |  __\| / \||  /    / \  | / \||  \/|| || / \|| |   
       | |   | |-|||  \_   | |  | \_/||    /| || |-||| |_/\
       \_/   \_/ \|\____/  \_/  \____/\_/\_\\_/\_/ \|\____/
    */
    
    @FXML private Slider sliderFactorial;
    @FXML private Label lblFactorial;
    
    @FXML public void displayFactorial() {
        // TODO
        // Given the value from the Slider sliderFactorial, compute for the
        // factorial. You can get an integer equivalent of the value by using
        // (int)sliderFactorial.getValue().
        //
        // Display the factorial in lblFactorial.
        int factorialTotal = 1;
        for (int i = (int)sliderFactorial.getValue(); i > 0; i--) {
            factorialTotal *= i;
        }
        lblFactorial.setText((int)sliderFactorial.getValue() + "! = " + String.valueOf(factorialTotal));
    }
    
    /* Code in this segment belongs to the programming problem BULLSEYE
        ____  _     _     _     ____  ________  _ _____
       /  _ \/ \ /\/ \   / \   / ___\/  __/\  \///  __/
       | | //| | ||| |   | |   |    \|  \   \  / |  \  
       | |_\\| \_/|| |_/\| |_/\\___ ||  /_  / /  |  /_ 
       \____/\____/\____/\____/\____/\____\/_/   \____\
    */
    
    @FXML private ImageView imgBullseye;
    @FXML private ImageView imgCrosshair;
    @FXML private Label lblDistanceToTarget;
    
    
    
    /* Code in this segment belongs to the programming problem on BUMPER
        ____  _     _      ____  _____ ____ 
       /  __\/ \ /\/ \__/|/  __\/  __//  __\
       | | //| | ||| |\/|||  \/||  \  |  \/|
       | |_\\| \_/|| |  |||  __/|  /_ |    /
       \____/\____/\_/  \|\_/   \____\\_/\_\
    */
    
    @FXML private ImageView sprite;
    
    /**
     * Invokes the same convenience methods for pressing the up and down buttons
     * on the display.
     * @param ke determines the pressed key
     */
    @FXML public void bumperKeyPress(KeyEvent ke) {
        if(null != ke.getCode()) {
            switch (ke.getCode()) {
                case UP:
                    spriteUp();
                    break;
                case DOWN:
                    spriteDown();
                    break;
                case LEFT:
                    spriteLeft();
                    break;
                case RIGHT:
                    spriteRight();
                    break;
            }
        }
    }
    
    @FXML public void spriteUp() {
        System.out.println("Current location: "+sprite.getLayoutX()+", "+sprite.getLayoutY());
        // TODO
        // Use setLayoutY() to adjust the current location of the sprite by
        // 10 pixels less. The setLayoutY method takes an integer as a
        // parameter.
        sprite.setLayoutY(sprite.getLayoutY()-10);
        changeSprite("up");
    }
    
    @FXML public void spriteDown() {
        System.out.println("Current location: "+sprite.getLayoutX()+", "+sprite.getLayoutY());
        // TODO
        // Use setLayoutY() to adjust the current location of the sprite by
        // 10 pixels more. The setLayoutY method takes an integer as a
        // parameter.
        sprite.setLayoutY(sprite.getLayoutY()+10);
        changeSprite("down");
    }
    
    @FXML public void spriteLeft() {
        System.out.println("Current location: "+sprite.getLayoutX()+", "+sprite.getLayoutY());
        // TODO
        // Use setLayoutX() to adjust the current location of the sprite by
        // 10 pixels less. The setLayoutY method takes an integer as a
        // parameter.
        sprite.setLayoutX(sprite.getLayoutX()-10);
        changeSprite("left");
    }
    
    @FXML public void spriteRight() {
        System.out.println("Current location: "+sprite.getLayoutX()+", "+sprite.getLayoutY());
        // TODO
        // Use setLayoutX() to adjust the current location of the sprite by
        // 10 pixels more. The setLayoutY method takes an integer as a
        // parameter.
        sprite.setLayoutX(sprite.getLayoutX()+10);
        changeSprite("right");
    }
    
    private void changeSprite(String direction) {
        // TODO
        // This method is called by spriteUp, spriteDown, spriteLeft, and
        // spriteRight with the respective String "up", "down", "left", and
        // "right". Change the string in the constructor below to the correct
        // filename. The filename for the sprites are "up.gif", "down.gif",
        // "left.gif", and "right.gif". The complete path for the up picture is
        // "src/longtest/sprite/up.gif".
        
        Image spriteImage = new Image("file:src/longtest/sprite/"+direction+".gif");
        sprite.setImage(spriteImage);
    }
    
    /* Code in this segment belongs to the programming problem on CLOCK
        ____  _     ____  ____  _  __
       /   _\/ \   /  _ \/   _\/ |/ /
       |  /  | |   | / \||  /  |   / 
       |  \__| |_/\| \_/||  \__|   \ 
       \____/\____/\____/\____/\_|\_\
    */
    
    @FXML private ImageView hourHand;
    @FXML private ImageView minuteHand;
    @FXML private Label hourDigital;
    @FXML private Label minuteDigital;
    
    /**
     * Invokes the same convenience methods for pressing the direction buttons
     * on the display.
     * @param ke determines the pressed key
     */
    @FXML public void clockKeyPress(KeyEvent ke) {
        if(null != ke.getCode()) {
            if(ke.isShiftDown()) {
                switch (ke.getCode()) {
                    case UP:
                        hourUp();
                        break;
                    case DOWN:
                        hourDown();
                        break;
                }
            }
            else {
                switch (ke.getCode()) {
                    case UP:
                        minuteUp();
                        break;
                    case DOWN:
                        minuteDown();
                        break;
                }
            }
        }
    }

    /**
     * Returns a two-digit String representation of a number.
     * @param number an integer to convert to a two-digit String
     * @return a two-digit String representation of a number
     */
    private String twoDigits(int number) {
        return number < 10 ? "0" + number : "" + number;
    }
    
    private void rotateHands() {
        double minuteRotate = 0;
        double hourRotate = 0;
        double minuteValue = Double.parseDouble(minuteDigital.getText());
        double hourValue = Double.parseDouble(hourDigital.getText());
        // TODO
        // Compute for the rotation of the minute hand and the hour hand.
        // minuteRotate = ???;
        // hourRotate = ???;
        minuteRotate = minuteValue / 60;
        hourRotate = hourValue/12;
        minuteHand.setRotate(360 * minuteRotate);
        hourHand.setRotate(360 * hourRotate);
    }
    
    @FXML public void minuteUp() {
        int oldValue = Integer.parseInt(minuteDigital.getText());
        int newValue;
        // When the up arrow is pressed for minutes, increase the minute by one
        // cyclically. Meaning, should the value be greater than 59, it goes
        // back to 0. It also calles the hourUp method() in that case.
        newValue = (oldValue + 61) % 60;
        if(oldValue == 59) hourUp();
        minuteDigital.setText(twoDigits(newValue));
        rotateHands();
    }
    
    @FXML public void minuteDown() {
        int oldValue = Integer.parseInt(minuteDigital.getText());
        int newValue;
        // When the down arrow is pressed for minutes, decrease the minute by
        // one cyclically. Meaning, should the value be less than zero, it goes
        // back to 59. It also calls the hourDown() method in that case.
        newValue = (oldValue + 59) % 60;
        if(oldValue == 00) hourDown();
        minuteDigital.setText(twoDigits(newValue));
        rotateHands();
    }
    
    @FXML public void hourUp() {
        int oldValue = Integer.parseInt(hourDigital.getText());
        int newValue;

        // TODO
        // CHANGE the formula to compute for the new value of the minute hand
        // when the up arrow is pressed. The new value should never be zero. It
        // should be 12 in that case.
        newValue = oldValue + 1;
        if (newValue > 23)
            newValue = 0;
        hourDigital.setText(twoDigits(newValue));
        rotateHands();
    }
    
    @FXML public void hourDown() {
        int oldValue = Integer.parseInt(hourDigital.getText());
        int newValue;

        // TODO
        // CHANGE the formula to compute for the new value of the minute hand
        // when the down arrow is pressed. The new value should never be zero.
        // It should be 12 in that case.
        newValue = oldValue - 1;
        if (newValue < 0)
            newValue = 23;
        hourDigital.setText(twoDigits(newValue));
        rotateHands();
    }
    
    /* Code in this segment belongs to the programming problem on COLOR CHANGER
        ____  ____  _     ____  ____    ____  _     ____  _      _____ _____ ____ 
       /   _\/  _ \/ \   /  _ \/  __\  /   _\/ \ /|/  _ \/ \  /|/  __//  __//  __\
       |  /  | / \|| |   | / \||  \/|  |  /  | |_||| / \|| |\ ||| |  _|  \  |  \/|
       |  \__| \_/|| |_/\| \_/||    /  |  \__| | ||| |-||| | \||| |_//|  /_ |    /
       \____/\____/\____/\____/\_/\_\  \____/\_/ \|\_/ \|\_/  \|\____\\____\\_/\_\
    */
    
    @FXML private ColorPicker picker;
    
    @FXML public void clickShape(MouseEvent me) {
        // TODO
        // me is a MouseEvent that is triggered when you click an object
        // In this case, the objects are of the class Rectangle.
        // Rectangles have a setFill() method that accepts a Color as a parameter.
        // Incidentally, you can get the value of a ColorPicker as a Color.
        //
        // Write the code to change the color of the clicked Rectangle to the
        // current setting in the ColorPicker named picker.
        ((Rectangle)me.getSource()).setFill(picker.getValue());
    }
    
    /* Code in this segment belongs to the programming problem on CLOCK
        _  ____    ____  ____ ___  _ ____ 
       / \/_   \  /  _ \/  _ \\  \/// ___\
       | | /   /  | | \|| / \| \  / |    \
       | |/   /_  | |_/|| |-|| / /  \___ |
       \_/\____/  \____/\_/ \|/_/   \____/
    */
    
    /* ALL THE DAYS
    On the 12th day of Christmas, my true love gave to me
    Twelve drummers drumming
    Eleven pipers piping
    Ten lords a-leaping
    Nine ladies dancing
    Eight maids a-milking
    Seven swans a-swimming
    Six geese a-laying
    Five golden rings
    Four calling birds
    Three French hens
    Two turtle doves and
    A partridge in a pear tree
    */
    
    @FXML private Slider sliderDays;
    @FXML private Label lblDay;
    @FXML private TextArea txtLyrics;
    
    @FXML public void changeSlider() {
        System.out.println((int)sliderDays.getValue());
        // TODO
        // Update the Label lblDay with the value from the Slider.
        // 
        // For the line "On the nth day of Christmas, ...", display the proper
        // form of the ordinal based on the number. You don't want to see "On
        // the 1th day..."
        //
        // Display the lyrics for the specified day in the TextArea txtLyrics.
        //
        // If you need to put Strings together and you want to go to the next
        // line for a display in a TextArea, you can use "\n" as a new line
        // character. I wouldn't mind if the lyrics were in paragraph form,
        // though.
        lblDay.setText(String.valueOf(sliderDays.getValue()));
        String[] lyrics = {"Twelve drummers drumming" , "Eleven pipers piping" , "Ten lords a-leaping" , ""};
    }
    
    /**
     * Don't touch this.
     * I can touch this any time I want, sir.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

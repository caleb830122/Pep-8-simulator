package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import view.JLabeledTextArea;
import org.junit.jupiter.api.Test;

/**
 * A JUnit 5 tester to see if JLabeledTextArea can be interacted with as intended.
 *
 * @version 5 November 2020
 */
public class JLabelTextAreaTest {

    /**
     * Tests the getter method alone to see if it properly outputs a String from the View.JLabeledTextArea.
     */
    @Test
    void testGetText() {
        JLabeledTextArea testJLTextArea = new JLabeledTextArea();

        assertEquals(testJLTextArea.getText(), "");
    }

    /**
     * Tests the getter and setter methods to see if they properly input and output Strings into the View.JLabeledTextArea.
     */
    @Test
    void testSetThenGetText() {
        JLabeledTextArea testJLTextArea = new JLabeledTextArea();
        String inputString = new String("Dog");

        testJLTextArea.setText(inputString);
        assertEquals(testJLTextArea.getText(), inputString);
    }

    /**
     * Tests to see if the toString() method displays the field values of the View.JLabeledTextArea as expected.
     */
    @Test
    void testToString() {
        JLabeledTextArea testJLTextArea = new JLabeledTextArea("test");
        assertEquals(testJLTextArea.toString(), "View.JLabeledTextArea[myTitleLabel=Test,myTextArea=]");
    }
}

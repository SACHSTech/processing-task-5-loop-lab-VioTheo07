import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// sample code, delete this stuff
    /*
    stroke(128);
    line(150, 25, 270, 350);  

    stroke(255);
    line(50, 125, 70, 50);  
*/
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

    
  }


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 3 + intRow * 10;  //Instead of zero, calculate the proper intX location using 'intRow'
        intY = 300 + 3 + intColumn * 10; //Instead of zero, calculate the proper intY location using 'intColumn'

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  /**
   * Use the modulus operator and an if statement to select the color
   * Don't loop from 30 to 60 to shift everything over, just add 300 to x.
   */
  public void draw_section2(){
    int intX = 0;
    int intY = 0;
    
    for (int intRow = 0; intRow < 30; intRow++) {
        for (int intColumn = 0; intColumn < 30; intColumn++) {
            intX = 3 + intRow * 10 + 300; // Shift over by adding 300 to x
            intY = 300 + 3 + intColumn * 10;
    
            if ((intRow) % 2 == 0) { // Use modulus operator to select color
                fill(0); // Black
            } else {
                fill(255); // White
            }
            noStroke();
            rect(intX, intY, 5, 5);
      }
    }        
  }

  /**
   * Use the modulus operator and an if/else statement to select the color.
   * Don't use multiple 'if' statements.
   */

  public void draw_section3(){
    int intX = 0;
    int intY = 0;
    
    for (int intRow = 0; intRow < 30; intRow++) {
        for (int intColumn = 0; intColumn < 30; intColumn++) {
            intX = 3 + intRow * 10 + 600; // Shift over by adding 300 to x
            intY = 300 + 3 + intColumn * 10;
    
            if ((intColumn) % 2 == 0) { // Use modulus operator to select color
                fill(0); // Black
            } else {
                fill(255); // White
            }
            noStroke();
            rect(intX, intY, 5, 5);
        }
      }
    }      

  /**
   * Use the modulus operator and just one 'if' statement to select the color.
   */
  public void draw_section4(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
        for(int intColumn = 0; intColumn < 30; intColumn++){
            intX = 3 + intRow * 10 + 900; // Shift over by adding 900 to x
            intY = 300 + 3 + intColumn * 10;

            if((intRow + intColumn) % 2 == 0 && intRow % 2 == 0){ // Use one 'if' statement to select color
                fill(255, 255, 255);
            } else {
                fill(0, 0, 0);
            }
            noStroke();
            rect(intX, intY, 5, 5);
    }
  }
}

  /**
   * Do NOT use 'if' statements to complete 5-8. Manipulate the loops instead
   */
  public void draw_section5(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 1; intRow < 30; intRow++){
        for(int intColumn = intRow; intColumn < 30; intColumn++){
            intX = 3 + 300 - 2 * intRow * 5;
            intY = 3 + 2 + intColumn * 10;

            
            fill(255, 255, 255);
            noStroke();
            rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section6(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 1; intRow < 30; intRow++){
        for(int intColumn = intRow; intColumn < 30; intColumn++){
            intX = 3 + 290 + 2 * intRow * 5;
            intY = 3 + 2 + intColumn * 10;

            
            fill(255, 255, 255);
            noStroke();
            rect(intX, intY, 5, 5);
      }
    }
  }

  public void draw_section7(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow <= 30; intRow++){
        for(int intColumn = 0; intColumn < intRow; intColumn++){
            intX = 900 + 3 - 2 * intRow * 5;
            intY = 3 + 2 + intColumn * 10;

            
            fill(255, 255, 255);
            noStroke();
            rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 30; intRow++){
        for(int intColumn = 0; intColumn <= intRow; intColumn++){
            intX = 900 + 3 + 2 * intRow * 5;
            intY = 3 + 2 + intColumn * 10;

            
            fill(255, 255, 255);
            noStroke();
            rect(intX, intY, 5, 5);
      }
    }
  }
}

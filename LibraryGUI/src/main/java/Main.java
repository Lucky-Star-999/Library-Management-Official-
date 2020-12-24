
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Main {
    /*public static void main(String args[]){
        Frame1_Intro frame1 = new Frame1_Intro();
        frame1.setVisible(true);
    }*/
    Main(){
        Frame1_Intro frame1 = new Frame1_Intro();
        Frame2_LoginManager frame2 = new Frame2_LoginManager();
        Frame3_LoginStudent frame3 = new Frame3_LoginStudent();
        Frame4_RegisterManager frame4 = new Frame4_RegisterManager();
        //Frame5_RegisterStudent frame5 = new Frame5_RegisterStudent();
        Frame6_ProfileManager frame6 = new Frame6_ProfileManager();
        Frame7_ProfileStudent frame7 = new Frame7_ProfileStudent();
        Frame8_EditProfile frame8 = new Frame8_EditProfile();
        Frame9_PasswordChange frame9 = new Frame9_PasswordChange();
        Frame10_ManageStudents_General frame10 = new Frame10_ManageStudents_General();
        Frame11_ManageStudents_Detail frame11 = new Frame11_ManageStudents_Detail();
        Frame12_ChangeFine frame12 = new Frame12_ChangeFine();
        Frame13_SeeBorrowedBooks frame13 = new Frame13_SeeBorrowedBooks();
        Frame14_Book_Student frame14 = new Frame14_Book_Student();
                
                
        
        //Change the variable to test any frame
        JFrame frameTest = new JFrame();
        frameTest = frame6;
        
        
        
        frameTest.setVisible(true);
    }
}

import java.io.*;
public class StudentDataBinaryIO {
    public static void main(String[] args) {
        String fileName = "students.dat";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Aditya"); 
            dos.writeDouble(7.75); 
            dos.writeInt(102);
            dos.writeUTF("aman");
            dos.writeDouble(9.2);
            dos.writeInt(103);
            dos.writeUTF("Rahul");
            dos.writeDouble(7.9);
            System.out.println("Student data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("\nReading student data from file:");
            while (dis.available() > 0) {
                int rollNo = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();
                System.out.println("Roll No: " + rollNo + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}

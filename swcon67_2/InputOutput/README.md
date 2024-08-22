# IO

## IO API
- input ส่วนใหญ่ จะเป็น **supclass** ของ `Input Stream` หรือ `Reader`
- output ส่วนใหญ่ จะเป็น **supclass** ของ `Output Stream` หรือ `Writer`

- **InputStream/OutputStream**
    - read/write ข้อมูลเป็น byte\
    - FileInputStream / FileOutputStream อ่าน/เขียนไฟล์
    - DataInputStream / DataOutputStream อ่าน/เขียน primitive type data
    - ObjectInputStream / ObjectOutputStream อ่าน/เขียน object
    ex. อ่านไฟล์ image, music, binary data
- **Reader/Writer**
    - read/write ข้อมูลเป็น character(1 char = 2 btyes)\
    - FileReader/FileWriter อ่าน/เขียนไฟล์
    - IOBufferedReader/BufferedWriter อ่าน/เขียน ทีละบรรทัดได้ทํางานเร็ว
    - PrintWriter มี method println() เขียน String ใส่ไฟล์ได้ง่ายมาก
    ex. อ่านไฟล์ text, html, xml
- **InputStreamReader/OutputStreamWriter**
    - convert I`nputStream/OutputStream` to `Reader/Writer`

## Object reading and writing
> Conenection: เป็นการเชื่อมต่อระหว่างโปรแกรมกับไฟล์ หรือ โปรแกรมกับโปรแกรมอื่นๆ\
>Chain: การเชื่อมต่อหลายๆอย่างเข้าด้วยกัน

### Serialization
- การแปลง object ให้เป็น byte stream
- ใช้ `ObjectOutputStream` เพื่อเขียน object ลงไฟล์
- ใช้ `ObjectInputStream` เพื่ออ่าน object จากไฟล์
- ใช้ `Serializable` interface ในการประกาศ class ที่ต้องการ serialize

```java
class Student implements Serializable {
    private String name;
    private int age;
    private double gpa;
    // constructor, getter, setter
}
```
```java

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 3.5);
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```


### Deserialization
- การแปลง byte stream ให้เป็น object
- ใช้ `ObjectInputStream` เพื่ออ่าน object จากไฟล์
- ใช้ `Serializable` interface ในการประกาศ class ที่ต้องการ serialize
```java
class Student implements Serializable {
    private String name;
    private int age;
    private double gpa;
    // constructor, getter, setter
}
```
```java
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, 3.5);
        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(s1);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### SerialVersionID
- ใช้เพื่อระบุว่า class นั้นๆมีการเปลี่ยนแปลงหรือไม่

# Exception
### Type

- Syntax Error
- Runtime Error : ใช้ Exception ในการลดปริมาณของ error นี้
- Logic Error : จากโค้ดของเรา **อาจลดปัญหาด้วย Unit test**


> - Recovery : ช่วยให้โปรแกรมเมอร์จัดการกับ error ได้ตามต้องการ ทำด้วยการ try/catch
> - สามารถ pass control ไป caller ที่รู้ว่าควรจะจัดการอย่างไรกับ error

### Hierarchy

    Object
    |__ Throwable
        |__ Error
        |__ Exception  
            |__ RuntimeException
            |__ IOException (Checked Exception)

### Error
### Unchecked Exception
- เป็น subclass ของ RuntimeException
- Exception ที่แสดงถึง ความผิดพลาดในการเขียนโปรแกรม
- อาจถูกโยนโดย JVM หรือ ไม่ต้องส่งต่อหรือดักจับใด ๆ

### Checked exception (cont.)
- **เป็น subclass ของ Exception (ที่ไม่ใช่ RuntimeException)**
- Exception ที่แสดงถึง ปัญหาสุดวิสัยที่เกิดขึ้นได้เสมอ และไม่อาจควบคุมได้
- มักเกิดจากโปรแกรมเมอร์ที่เช็คโค้ด test case ไม่ครบ หรือผิดพลาดอื่นๆ\
Ex.
  - ไม่สามารถอ่านไฟล์ได้

  - ฐานข้อมูลมีปัญหา (checked exception)

  - network หลุด
- **จําเป็นต้องมีการส่งต่อ (declare) หรือดักจับ (try-catch)**
  - method หรือ constructor จะต้อง ส่งต่อ (throws) ไปให้ caller
  - method หรือ constructor จะต้อง รับ (try/catch) exception นั้นเอง

### Exceptin Handling

- การจัดการกับ Exception ใน Java สามารถทำได้โดยใช้ try, catch, finally และ throw โดยมีลำดับการทำงานดังนี้
  - ทำงานในบล็อค try ถ้าไม่เกิด Exception จะข้ามไปทำงานใน finally
  - ถ้าเกิด Exception จะทำงานใน catch และจะข้ามไปทำงานใน finally
  - ทำงานใน finally ไม่ว่าจะเกิด Exception หรือไม่ก็จะทำงานใน finally ทันที
- การแจ้ง error ด้วยการโยน (throw) exception​ : throw exception ได้ทั้งใน method และ constructor

4. หาก exception ที่เรา declare เป็น super/subclass กัน เรา declare แค่ superclass ก็ได้

5. แต่การ declare ทั้ง superclass และ subclass จะให้โค้ดเข้าใจง่ายกว่า โปรแกรมเมอร์จะได้เห็นชัดเจนว่า มี checked exception ใดถูกโยนบ้าง

```java
public void read(String filename) throws FileNotFoundException,  IOException, NotEnoughBalanceException 
{
    FileReader reader = new FileReader(filename);
    // code...
9 }
```

## การดักจับ Exception
### Try/Catch
#### ไม่จําเป็นต้อง catch unchecked exception
- เนื่องจาก NumberFormatException เป็น unchecked exception\
  **ดังนั้น** ไม่จําเป็นต้อง catch NumberFormatException

- **การ execute catch clause จะเป็นไปตามลําดับ**
- **ดังนั้น subclass ควรอยู่บนและ superclass ควรอยู่ด้านล่าง**

### Rethrowing exception
- การโยน exception ให้ caller โดยใช้ throw จะทำให้ caller ต้องดักจับ exception นั้น
```java
public void read(String filename) throws IOException
{
    try {
        FileReader reader = new FileReader(filename);
        // code...
    } catch (FileNotFoundException e) {
        System.out.println("File not found");
    } catch (IOException e) {
        throw e;
    }
}
```
### กาารสร้าง Exception
- checked exception จะต้องสืบทอดจาก Exception หรือ subclass ของ Exception\
*ex.*
```java
public class NotEnoughBalanceException extends Exception {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
```

- การสร้าง unchecked exception จะต้องสืบทอดจาก RuntimeException หรือ subclass ของ RuntimeException\
*ex.*
```java
public class NotEnoughBalanceException extends RuntimeException {
    public NotEnoughBalanceException(String message) {
        super(message);
    }
}
```

### Finally clause

```java
try {
  โค้ดที่อาจทําให้เกิด exception
}
finally {
  โค้ดที่จะ execute หลัง การรันแบบปกติหรือแบบมีการ throw exception
  จะทํางานเสมอ ไม่ว่าจะมี exception หรือไม่รวมถึงจะทําก่อนการ return ค่าด้วย
}
```

#### finally with catch
- ถ้าเราต้องการจะ ใช้ catch และ finally ร่วมกัน ทําได้โดยการนํา finally clause ไว้ด้านล่างสุด

#### **System.exit(0)**

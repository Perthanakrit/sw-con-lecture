# Interface

### Constants in Interface
• **ไม่มี instance variables**\
• **ตัวแปร ใน Interface เป็ นค่าคงที8แบบ public static final**\
• **ไม่จําเป็น นต้องประกาศ**

## Polymorphism

```java
// Static type          // Dynamic type
Measurable meas = new BankAccount(); 
```

### anonymous class (**Behavior encapsulation**)

```java
import dataset.Measurer;

Dataset dataset = new Dataset();
dataset.average(re, new Measurer() {
    public double measure(Object object){
        return re.width * re.height;
    }
})
```

# Generice Type
- **Generic type คือ type ที่สามารถระบุ type ของ object ที่จะใช้งานได้ เพื่อตรวจสอบ type**
- **Generic type สามารถใช้งานได้กับ class, interface, method และ constructor**
```java
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
```

### Type parameter
- `E` : Element (used extensively by the Java Collections Framework)
- `K` : Key
- `N` : Number
- `T` : Type
- `V` : Value
- `S`, `U`, `V` etc. : 2nd, 3rd, 4th types



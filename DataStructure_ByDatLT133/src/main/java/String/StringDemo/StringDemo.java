package String.StringDemo;

public class StringDemo {
    public static void main(String[] args) {

        // ================================================================
        // 1. KHỞI TẠO STRING
        // ================================================================
        String s = "Hello, World!";
        String s2 = new String("Hello");
        char[] chars = {'J', 'a', 'v', 'a'};
        String fromChars = new String(chars);           // "Java"


        // ================================================================
        // 2. ĐỘ DÀI & KIỂM TRA RỖNG
        // ================================================================
        int len = s.length();                           // 13
        boolean empty = s.isEmpty();                    // false
        boolean blank = "   ".isBlank();                // true (Java 11+)


        // ================================================================
        // 3. TRUY CẬP KÝ TỰ
        // ================================================================
        char c = s.charAt(0);                           // 'H'
        int codePoint = s.codePointAt(0);               // 72 (ASCII của 'H')


        // ================================================================
        // 4. TÌM VỊ TRÍ (INDEX)
        // ================================================================
        int idx1 = s.indexOf('o');                      // 4   — vị trí đầu tiên
        int idx2 = s.indexOf('o', 5);                   // 8   — tìm từ index 5
        int idx3 = s.indexOf("World");                  // 7   — tìm chuỗi con
        int idx4 = s.lastIndexOf('o');                  // 8   — vị trí cuối cùng
        int idx5 = s.lastIndexOf('o', 7);               // 4   — tìm ngược từ index 7
        boolean contains = s.contains("World");         // true


        // ================================================================
        // 5. CHUỖI CON (SUBSTRING)
        // ================================================================
        String sub1 = s.substring(7);                   // "World!"      — từ index 7 đến hết
        String sub2 = s.substring(7, 12);               // "World"       — từ 7 đến 11 (không lấy 12)


        // ================================================================
        // 6. SO SÁNH
        // ================================================================
        boolean eq1 = s.equals("Hello, World!");        // true  — phân biệt hoa thường
        boolean eq2 = s.equalsIgnoreCase("hello, world!"); // true — không phân biệt
        int cmp1 = s.compareTo("Hello, World!");        // 0     — bằng nhau
        int cmp2 = "apple".compareTo("banana");         // < 0   — apple đứng trước
        int cmp3 = "banana".compareToIgnoreCase("BANANA"); // 0
        boolean starts = s.startsWith("Hello");         // true
        boolean ends   = s.endsWith("!");               // true
        boolean starts2 = s.startsWith("World", 7);    // true  — kiểm tra từ index 7


        // ================================================================
        // 7. CHUYỂN ĐỔI HOA / THƯỜNG
        // ================================================================
        String upper = s.toLowerCase();                 // "hello, world!"
        String lower = s.toUpperCase();                 // "HELLO, WORLD!"


        // ================================================================
        // 8. XÓA KHOẢNG TRẮNG
        // ================================================================
        String padded = "   Hello   ";
        String trimmed  = padded.trim();                // "Hello"   — xóa 2 đầu (kể cả \t \n)
        String stripped = padded.strip();               // "Hello"   — giống trim, chuẩn Unicode (Java 11+)
        String stripL   = padded.stripLeading();        // "Hello   "
        String stripR   = padded.stripTrailing();       // "   Hello"


        // ================================================================
        // 9. THAY THẾ
        // ================================================================
        String rep1 = s.replace('l', 'r');              // "Herro, Worrd!"  — thay ký tự
        String rep2 = s.replace("World", "Java");       // "Hello, Java!"   — thay chuỗi
        String rep3 = s.replaceFirst("[aeiou]", "*");   // thay nguyên âm đầu tiên
        String rep4 = s.replaceAll("[aeiou]", "*");     // thay tất cả nguyên âm (regex)


        // ================================================================
        // 10. TÁCH CHUỖI (SPLIT)
        // ================================================================
        String csv = "apple,banana,cherry";
        String[] parts1 = csv.split(",");               // ["apple", "banana", "cherry"]
        String[] parts2 = csv.split(",", 2);            // ["apple", "banana,cherry"] — giới hạn 2 phần

        String spaced = "Hello   World";
        String[] words = spaced.split("\\s+");          // ["Hello", "World"] — split nhiều space


        // ================================================================
        // 11. NỐI CHUỖI (JOIN & CONCAT)
        // ================================================================
        String joined1 = String.join(", ", "a", "b", "c");      // "a, b, c"
        String joined2 = String.join("-", parts1);               // "apple-banana-cherry"
        String concat  = "Hello".concat(", World!");             // "Hello, World!"


        // ================================================================
        // 12. CHUYỂN ĐỔI SANG KIỂU KHÁC (valueOf / parse)
        // ================================================================
        // primitive → String
        String fromInt    = String.valueOf(42);          // "42"
        String fromDouble = String.valueOf(3.14);        // "3.14"
        String fromBool   = String.valueOf(true);        // "true"
        String fromChar2  = String.valueOf('A');         // "A"

        // String → primitive
        int    toInt    = Integer.parseInt("42");        // 42
        double toDouble = Double.parseDouble("3.14");    // 3.14
        boolean toBool  = Boolean.parseBoolean("true"); // true
        long   toLong   = Long.parseLong("123456789");  // 123456789L

        // String ↔ char[]
        char[] toCharArray = s.toCharArray();            // ['H','e','l','l','o',...]
        String backToStr   = new String(toCharArray);    // "Hello, World!"

        // String → byte[]
        byte[] bytes = s.getBytes();                     // mảng byte UTF-8 mặc định


        // ================================================================
        // 13. ĐỊNH DẠNG CHUỖI (FORMAT)
        // ================================================================
        String fmt1 = String.format("Name: %s, Age: %d, GPA: %.2f", "Alice", 20, 3.756);
        // "Name: Alice, Age: 20, GPA: 3.76"

        String fmt2 = String.format("%-10s | %5d | %8.2f", "Apple", 10, 99.9);
        // "Apple      |    10 |    99.90"   — căn trái/phải

        String fmt3 = "Hello %s".formatted("World");    // Java 15+ — "Hello World"


        // ================================================================
        // 14. KIỂM TRA BẰNG REGEX (matches)
        // ================================================================
        boolean isDigit  = "12345".matches("\\d+");     // true  — toàn số
        boolean isAlpha  = "Hello".matches("[a-zA-Z]+");// true  — toàn chữ
        boolean isEmail  = "a@b.com".matches("[\\w.]+@[\\w.]+\\.[a-z]{2,}"); // true


        // ================================================================
        // 15. INTERN & IDENTITY
        // ================================================================
        String a = new String("hello");
        String b = new String("hello");
        boolean refEq  = (a == b);                      // false — khác object
        boolean valEq  = a.equals(b);                   // true  — cùng giá trị
        boolean intern = (a.intern() == b.intern());    // true  — cùng pool


        // ================================================================
        // 16. REPEAT & STRIP (Java 11+)
        // ================================================================
        String rep = "ab".repeat(3);                    // "ababab"
        String line = "  hello  ".strip();              // "hello"


        // ================================================================
        // 17. LINES & INDENT (Java 11+)
        // ================================================================
        String multiline = "line1\nline2\nline3";
        multiline.lines()                               // Stream<String> — mỗi dòng 1 phần tử
                .forEach(System.out::println);

        String indented = "hello".indent(4);            // "    hello\n"


        // ================================================================
        // 18. STRINGBUILDER — khi cần nối chuỗi nhiều lần
        // ================================================================
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");                             // thêm vào cuối
        sb.append(", ");
        sb.append("World");
        sb.insert(5, "!!!");                            // chèn vào giữa → "Hello!!!, World"
        sb.delete(5, 8);                                // xóa đoạn       → "Hello, World"
        sb.reverse();                                   // đảo ngược       → "dlroW ,olleH"
        sb.replace(0, 5, "Java");                       // thay đoạn
        String built = sb.toString();                   // chuyển về String

        int sbLen = sb.length();                        // độ dài hiện tại
        sb.setCharAt(0, 'j');                           // sửa ký tự tại index
        char sbChar = sb.charAt(0);                     // lấy ký tự tại index
        sb.deleteCharAt(0);                             // xóa 1 ký tự
        sb.setLength(3);                                // cắt ngắn còn 3 ký tự


        // ================================================================
        // PRINT ĐỂ KIỂM TRA
        // ================================================================
        System.out.println("=== Basic ===");
        System.out.println("length     : " + len);
        System.out.println("charAt(0)  : " + c);
        System.out.println("indexOf(o) : " + idx1);
        System.out.println("substring  : " + sub1);
        System.out.println("contains   : " + contains);
        System.out.println("replace    : " + rep2);
        System.out.println("split[0]   : " + parts1[0]);
        System.out.println("join       : " + joined1);
        System.out.println("format     : " + fmt1);
        System.out.println("parseInt   : " + toInt);
        System.out.println("repeat     : " + rep);
        System.out.println("StringBuilder: " + built);
    }
}

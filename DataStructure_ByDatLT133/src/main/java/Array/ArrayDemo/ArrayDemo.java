package Array.ArrayDemo;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayDemo {

    public static void main(String[] args) {

        // ================================================================
        // 1. KHAI BÁO & KHỞI TẠO
        // ================================================================
        int[] a1 = new int[5];                          // [0, 0, 0, 0, 0]       — mặc định 0
        int[] a2 = {10, 20, 30, 40, 50};                // khai báo trực tiếp
        int[] a3 = new int[]{1, 2, 3};                  // khai báo tường minh
        String[] sa = new String[3];                    // [null, null, null]     — mặc định null
        double[] da = new double[4];                    // [0.0, 0.0, 0.0, 0.0]

        // mảng 2 chiều
        int[][] matrix = new int[3][4];                 // 3 hàng, 4 cột
        int[][] m2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};       // khai báo trực tiếp
        int[][] jagged = new int[3][];                  // mảng lởm chởm — mỗi hàng khác độ dài
        jagged[0] = new int[]{1};
        jagged[1] = new int[]{2, 3};
        jagged[2] = new int[]{4, 5, 6};


        // ================================================================
        // 2. ĐỘ DÀI
        // ================================================================
        int len = a2.length;                            // 5 — là field, không phải method (không có ())
        int rows = m2.length;                           // 3 — số hàng
        int cols = m2[0].length;                        // 3 — số cột hàng đầu


        // ================================================================
        // 3. TRUY CẬP & GÁN GIÁ TRỊ
        // ================================================================
        int val = a2[0];                              // 10  — lấy phần tử index 0
        a2[0] = 99;                                 // gán giá trị mới
        int last = a2[a2.length - 1];                  // 50  — phần tử cuối
        int cell = m2[1][2];                           // 6   — hàng 1, cột 2


        // ================================================================
        // 4. DUYỆT MẢNG
        // ================================================================
        // for thường — khi cần index
        for (int i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + " ");
        }

        // for-each — khi không cần index
        for (int x : a2) {
            System.out.print(x + " ");
        }

        // duyệt mảng 2 chiều
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + " ");
            }
        }

        // duyệt bằng Arrays.stream (Java 8+)
        Arrays.stream(a2).forEach(x -> System.out.print(x + " "));


        // ================================================================
        // 5. SẮP XẾP (SORT)
        // ================================================================
        int[] arr = {5, 3, 8, 1, 9, 2};

        Arrays.sort(arr);                               // [1, 2, 3, 5, 8, 9] — tăng dần, in-place
        Arrays.sort(arr, 1, 4);                         // chỉ sort đoạn [1..3] — từ index 1 đến 3

        // sort mảng Object (String, Integer...)
        String[] words = {"banana", "apple", "cherry"};
        Arrays.sort(words);                             // ["apple", "banana", "cherry"]
        Arrays.sort(words, Collections.reverseOrder()); // ["cherry", "banana", "apple"] — giảm dần

        // sort mảng Object theo tiêu chí tùy chỉnh
        String[] byLength = {"banana", "fig", "cherry", "kiwi"};
        Arrays.sort(byLength, (x, y) -> x.length() - y.length()); // sort theo độ dài tăng dần


        // ================================================================
        // 6. TÌM KIẾM (SEARCH)
        // ================================================================
        int[] sorted = {1, 2, 3, 5, 8, 9};

        // Binary Search — PHẢI sort trước
        int idx = Arrays.binarySearch(sorted, 5);       // 3   — trả về index
        int notFound = Arrays.binarySearch(sorted, 4);  // < 0 — không tìm thấy

        // tìm thủ công — Linear Search
        int target = 8;
        int foundIdx = -1;
        for (int i = 0; i < sorted.length; i++) {
            if (sorted[i] == target) {
                foundIdx = i;
                break;
            }
        }


        // ================================================================
        // 7. SAO CHÉP (COPY)
        // ================================================================
        int[] src = {1, 2, 3, 4, 5};

        // copy toàn bộ
        int[] copy1 = Arrays.copyOf(src, src.length);          // [1, 2, 3, 4, 5]
        int[] copy2 = src.clone();                              // [1, 2, 3, 4, 5]

        // copy và resize
        int[] bigger = Arrays.copyOf(src, 8);                  // [1, 2, 3, 4, 5, 0, 0, 0] — thêm 0
        int[] smaller = Arrays.copyOf(src, 3);                 // [1, 2, 3]                — cắt bớt

        // copy đoạn từ index
        int[] range = Arrays.copyOfRange(src, 1, 4);           // [2, 3, 4] — từ 1 đến 3

        // copy bằng System.arraycopy — nhanh nhất
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, 5);                  // src[0..4] → dest[0..4]
        // System.arraycopy(src, srcPos, dest, destPos, length)


        // ================================================================
        // 8. ĐỔ ĐẦY GIÁ TRỊ (FILL)
        // ================================================================
        int[] filled = new int[5];
        Arrays.fill(filled, 7);                         // [7, 7, 7, 7, 7]
        Arrays.fill(filled, 1, 4, 0);                   // [7, 0, 0, 0, 7] — fill đoạn [1..3]


        // ================================================================
        // 9. SO SÁNH MẢNG
        // ================================================================
        int[] x = {1, 2, 3};
        int[] y = {1, 2, 3};
        int[] z = {1, 2, 4};

        boolean eq1 = Arrays.equals(x, y);              // true  — so sánh giá trị
        boolean eq2 = (x == y);                         // false — so sánh địa chỉ (KHÔNG dùng cái này)
        boolean eq3 = Arrays.equals(x, z);              // false

        // so sánh mảng 2 chiều
        int[][] ma = {{1, 2}, {3, 4}};
        int[][] mb = {{1, 2}, {3, 4}};
        boolean deep = Arrays.deepEquals(ma, mb);       // true


        // ================================================================
        // 10. CHUYỂN THÀNH STRING (IN RA)
        // ================================================================
        int[] nums = {1, 2, 3, 4, 5};
        String s1 = Arrays.toString(nums);              // "[1, 2, 3, 4, 5]"
        String s2 = Arrays.deepToString(m2);            // "[[1, 2, 3], [4, 5, 6], [7, 8, 9]]"


        // ================================================================
        // 11. CHUYỂN ĐỔI ARRAY ↔ LIST
        // ================================================================
        String[] strArr = {"a", "b", "c"};

        // array → List (fixed size, không add/remove được)
        List<String> fixedList = Arrays.asList(strArr);

        // array → ArrayList (dynamic, add/remove được)
        ArrayList<String> list = new ArrayList<>(Arrays.asList(strArr));
        list.add("d");                                  // được vì là ArrayList

        // List → array
        String[] backToArr = list.toArray(new String[0]);


        // ================================================================
        // 12. STREAM TRÊN ARRAY (Java 8+)
        // ================================================================
        int[] data = {3, 1, 4, 1, 5, 9, 2, 6};

        int sum = Arrays.stream(data).sum();                    // 31
        int min = Arrays.stream(data).min().getAsInt();         // 1
        int max = Arrays.stream(data).max().getAsInt();         // 9
        double avg = Arrays.stream(data).average().getAsDouble();  // 3.875
        long count = Arrays.stream(data).filter(n -> n > 3).count(); // 4

        int[] doubled = Arrays.stream(data)
                .map(n -> n * 2)
                .toArray();                            // [6,2,8,2,10,18,4,12]

        int[] distinct = Arrays.stream(data)
                .distinct()
                .sorted()
                .toArray();                          // [1,2,3,4,5,6,9]


        // ================================================================
        // 13. RESIZE THỦ CÔNG (dùng trong assignment DSA)
        // ================================================================
        // Java không resize array thật — phải tạo mới + copy
        int[] original = {1, 2, 3};
        int[] resized = Arrays.copyOf(original, original.length * 2); // [1, 2, 3, 0, 0, 0]

        // xóa phần tử tại index i — dịch chuyển về trái
        int[] toDelete = {10, 20, 30, 40, 50};
        int deleteIdx = 2;
        System.arraycopy(toDelete, deleteIdx + 1,
                toDelete, deleteIdx,
                toDelete.length - deleteIdx - 1);          // [10, 20, 40, 50, 50]
        // phần tử cuối giờ thừa → đặt về 0 hoặc giảm size


        // ================================================================
        // PRINT ĐỂ KIỂM TRA
        // ================================================================
        System.out.println("\n=== Kết quả ===");
        System.out.println("length         : " + len);
        System.out.println("sort           : " + Arrays.toString(arr));
        System.out.println("binarySearch   : " + idx);
        System.out.println("copyOfRange    : " + Arrays.toString(range));
        System.out.println("fill           : " + Arrays.toString(filled));
        System.out.println("equals         : " + eq1);
        System.out.println("toString       : " + s1);
        System.out.println("deepToString   : " + s2);
        System.out.println("stream sum     : " + sum);
        System.out.println("stream distinct: " + Arrays.toString(distinct));
        System.out.println("resized        : " + Arrays.toString(resized));
    }
}

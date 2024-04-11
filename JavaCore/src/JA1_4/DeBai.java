package JA1_4;

public class DeBai {
/*
 */
 /*
Tìm ước số lẻ lớn nhất của số nguyên dương a (Không tính tính số đó).
Đầu vào: nhập a
Đầu ra: ước số lẻ lớn nhất của a
VD : a = 50 có ước số lẻ lớn nhất là 25
Dưới đây là mã giả (pseudocode) cho bài tập của bạn
 để tìm ước số lẻ lớn nhất của số nguyên dương "a":
1. Khởi tạo biến `a` và biến `largestOddDivisor`.
2. Đọc giá trị nhập vào từ người dùng và gán cho biến `a`.
3. Kiểm tra nếu `a` là số chẵn, cập nhật `a` thành `a - 1` để bắt đầu tìm kiếm
từ ước số lẻ đầu tiên.
4. Lặp lại các bước sau đây, bắt đầu từ `i = a` đến `i >= 1` với các bước lặp
là giảm 2 đơn vị mỗi lần (vì chỉ quan tâm đến các ước số lẻ):
   - Kiểm tra xem `i` có phải là ước của `a` không bằng cách sử dụng phép chia
   lấy phần dư (`a % i == 0`).
   - Nếu `i` là ước số và là số lẻ (`i % 2 != 0`), gán `i` cho biến `largestOddDivisor`.
   - Ngừng vòng lặp (vì đây sẽ là ước số lẻ lớn nhất mà chúng ta có thể tìm thấy).
5. In ra `largestOddDivisor` là ước số lẻ lớn nhất của `a`.
Dưới đây là mã giả cụ thể hơn:
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX bai  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
Viết chương trình nhập vào từ bàn phím 1 số nguyên dương n bất kì. Tìm tất cả
các ước của số n sau đó tính tích các ước số đó và hiển thị ra màn hình
Đầu vào: Số nguyên dương n
Đầu ra: Hiển thị kết quả: "Cac uoc cua so [n] la : .....  "- "Tich cac uoc do : [tich]"
Ví Dụ: n = 10 => Hiển thị: "Cac uoc cua 10 la 1   2   5    10. Tich cac uoc do : 100".
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Sử dụng hàm tìm ước. Sau mỗi 1 vòng lặp thì nhân biến tích với ước số đó.
// Bắt đầu chương trình
1. Khởi tạo biến số nguyên tichUoc = 1
2. Khởi tạo một String deChuaUoc =""
3. In ra màn hình yêu cầu người dùng nhập vào một số nguyên dương n
4. Nhận đầu vào từ bàn phím và lưu vào biến n
5. Sử dụng vòng lặp for, i chạy từ 1 đến n
   - Trong mỗi vòng lặp, kiểm tra nếu n chia hết cho i (n % i == 0), thì:
        - Cập nhật tichUoc = tichUoc * i
        - Cập nhật deChuaUoc = deChuaUoc + " " + i
6. In ra màn hình chuỗi "Cac uoc cua so [n] la" + deChuaUoc
7. In ra màn hình chuỗi "Tich cac uoc do: " + tichUoc
// Kết thúc chương trình
*/
}

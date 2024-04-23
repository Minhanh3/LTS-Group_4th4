package JV3_1;

public class Debai {
    public static void main(String[] args) {
        double kq = Math.sqrt(6);
        double n = kq - Math.floor(kq);
        double n1 = Math.floor(kq);
        System.out.println("kq " + kq);
        System.out.println("n " + n);
        System.out.println("n1 " + n1);
    }
    /*
Cho 2 số thực a, b. Viết hàm để tính tích 2 số thực
Đầu vào: Các số a, b
Đầu ra: Kết quả tích a, b
Ví dụ: a = 2, b = 3 => Ta có tích a, b = 6
Chú ý: Đặt tên hàm theo quy tắc đặt tên
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
     */
    /*
Cho số nguyên dương n. Viết hàm kiểm tra số đó có phải là số chính phương không?
Số chính phương là bình phương của một số tự nhiên.
Ví dụ: 4,9 là số chính phương (4=2^2, 9=3^2)
Đầu vào: Số nguyên dương n
Đầu ra: Đúng hoặc sai
Ví dụ: n = 6 => sai
          n = 9 => đúng
Chú ý: Đặt tên hàm theo quy tắc đặt tên
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Viết hàm LaSoChinhPhuong với tham số truyền vào là n và kiểu trả về là bool.
Nếu đúng thì trả về true sai là false
     */
    /*
    JA3_1_04: Hàm nhập một số nguyên
Viết hàm nhập một số nguyên và trả lại số nguyên nhập được. Yêu cầu khi nhập liệu:
Cần kiểm tra được quy cách nhập liệu, nếu sai quy cách thì báo ra thông điệp lỗi.
- Đầu vào: Nhập vào từ bàn phím một số nguyên dương
- Đầu ra: In ra màn hình giá trị của a, nếu nhập sai thì hiển thị yêu cầu nhập lại
Ví dụ: a =5 => Ta có giá trị 5
           a = s => Nhập sai! Nhập lại
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng vòng lặp while.
Sau đó sử dụng try catch để kiểm tra ngoại lệ.
     */
    /*
Viết hàm sinh ra một số nguyên ngẫu nhiên.
- Đầu vào: tham số truyền vào là số nguyên a. Giá trị a được gán ngẫu nhiên qua
đối tượng random.Next()
- Đầu ra: Ta có giá trị a
Ví dụ: Truyền vào tham số a => Ta có giá trị ngẫu nhiên a = 5(giá trị ngẫu nhiên)
     */
    /*
Viết hàm nhập, xuất mảng 1 chiều các số nguyên gồm n phần tử
Đầu vào: Mảng số nguyên, số phần tử n
Đầu ra: Nhập các giá trị cho mảng rồi in mảng vừa nhập ra màn hình
Chú ý: Đặt tên hàm theo quy tắc đặt tên
Ví dụ: Mảng a có 5 phần tử =>
Mảng sau khi nhập: {1,2,3,4,5} => Ta có mảng a = {1,2,3,4,5}
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
     */
    /*
 Viết chương trình nhập vào một chuỗi ở dạng chưa chuẩn hóa, hiển thị một chuỗi đã chuẩn hóa.
Đầu vào: 1 chuỗi là họ tên và có dạng chưa chuẩn hóa.
Đầu ra: Chuỗi đã được chuẩn hoá
Ví dụ: " Nguyen    van      A   " => "Nguyen van a"
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Xóa bỏ khoảng trắng 2 đầu (Sử dụng hàm Trim())
Thay thế các khoảng trắng ở giữa các từ bằng 1 khoảng (Sử dụng hàm Replace())
Khởi tạo một hàm chỉ viết hoa kí tự đầu tiên của chuỗi.
     */
    /*
Viết hàm trả lại danh sách là đảo ngược của 1 danh sách truyền vào.
Đầu vào: Một danh sách các chuỗi
Đầu ra: Một danh sách đảo ngược của danh sách đầu vào và in các phần tử của
danh sách đó ra ngoài màn hình
Ví Dụ: Danh sách gồm các chuỗi: Nguyen Duc Toan, Nguyen Hoang Truong, Nguyen Dong Khanh
=> Kết quả: Nguyen Dong Khanh, Nguyen Hoang Truong, Nguyen Duc Toan
*Lưu ý: Không sử dụng vòng lặp for duyệt từ cuối mảng như những bài trước
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Viết vòng lặp for duyệt in phần tử trong mảng.
Sử dụng Collections.reverse. để đảo ngược phần tử
     */
   /*
   Viết chương trình nhập vào một họ tên bất kì và thực hiện chuẩn hóa họ tên đó.
Đầu vào: Chuỗi chưa chuẩn hoá
Đầu ra: Chuỗi đã chuẩn hoá
Ví Dụ: Trước khi chuẩn hóa: " nguyen        van   Toan", sau khi chuẩn hóa
"Nguyen Van Toan".
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng Trim() để cắt khoảng trắng ở hai đầu.
Sử dụng split() để thực hiện tách chuỗi.
Viết một hàm dùng vòng lặp for kết hợp với subtring() và toUpper() để thực hiện in hoa.
    */
    /*
Cho 1 mảng số nguyên n phần tử. Viết hàm nhập mảng, sắp xếp các phần tử
trong mảng theo thứ tự tăng dần rồi in kết quả của mảng vừa sắp xếp ra màn hình
Đầu vào: Mảng a gồm n phần tử
Đầu ra: Mảng a đã được sắp xếp
Chú ý: Đặt tên hàm theo quy tắc đặt tên. Chia nhỏ bài toán để viết thành các hàm riêng
(Hàm nhập xuất và sắp xếp mảng)
Ví dụ: a[] = {2,3,5,1,2,3} => {1,2,2,3,3,5}
     */
    /*
 Viết chương trình Java nhập vào một mảng số nguyên, thực hiện sắp xếp theo thứ tự tăng dần rồi in ra màn hình mảng đã được sắp xếp

Đầu vào: 1 mảng số nguyên bất kì chưa được sắp xếp
Đầu ra: 1 mảng số nguyên đã được sắp xếp theo thứ tự tăng dần và hiển thị mảng đó ra ngoài màn hình

Ví dụ: a[] = {3,1,5,4,2} => a[] = {1,2,3,4,5}

*Lưu ý: Làm theo 2 cách ( Sử dụng thuật toán để sắp xếp và không sử dụng thuật toán )

Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán

Gợi ý

Gợi ý file source.java

Thay vì sử dụng các thuật toán sắp xếp đã được học như nổi bọt, cái giỏ và chèn như ở các phần trước thì phương thức Sort() ở trong java sẽ hỗ trợ ta sắp xếp 1 mảng các kí tự theo thứ tự tăng dần.
     */
    /*
 Viết hàm để nhập và hiển thị chuỗi nhập vào từ bàn phím.​​​​
- Đầu vào: Tham số truyền vào là một chuỗi
Yêu cầu: Nhập chuỗi từ bàn phím và trả về chuỗi vừa nhập
- Đầu ra: Chuỗi đã nhập
Ví dụ: Ta có str = "Hello World" => "Hello Word"
     */
    /*
    Viết chương trình Java thực hiện tính tổng các phần tử của mảng rồi in ra màn hình.
- Đầu vào: Một mảng chứa các phần tử là số nguyên
- Đầu ra: Tổng của các phần tử trong mảng đó
Ví dụ : Ta có mảng a[] = { 1,2,3,4,5} => Tổng các phần tử trong mảng là 15
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng vòng lặp for.
     */
 /*
 JA3_1_18: Hàm tìm phần tử chẵn đầu tiên trong mảng
 Cho mảng a = { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. Viết hàm tìm phần tử chẵn đầu tiên trong
 mảng sau đó hiển thị phần tử đó.
- Đầu vào: Mảng a
- Đầu ra: Phần tử chẵn đầu tiên của mảng a
Ví dụ: a = { 1, 4, 7, 8, 9, 6, 3, 2, 5 } => Phần tử chẵn đầu tiên = 4
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng vòng for.
  */
    /*
 Viết chương trình giải phương trình bậc 2
- Đầu vào: 3 biến số nguyên a, b,c
- Đầu ra: Nghiệm của phương trình
Ví dụ:
Đầu vào: a = 1, b= 6 , c = 3
Đầu ra: 2 nghiệm x1 x2 phân biệt
Lưu ý: Tách các công đoạn thành các hàm nhỏ
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Tính delta theo công thức
b2 - 4ac
với delta > 0. pt có 2 nghiệm là x = (-b+ căn delta) / 2a và (-b - căn delta) / 2a
     */
    /*
    JA3_2_03: Khai báo danh sách cơ bản
 Viết chương trình Java khai báo một danh sách chuỗi và hiển thị các phần tử ra màn hình.
Đầu vào: Một danh sách gồm các chuỗi.
Đầu ra: Hiển thị các phần tử trong danh sách đó.
Ví dụ:
Đầu vào: lst = { "123", "345", " qwe" }
Đầu ra: result = { "123", "345", "qwe" }
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng vòng lặp for để duyệt.
     */
    /*
 Viết chương trình sử dụng Math.min() tìm số nhỏ nhất trong 3 số cho trước thuộc kiểu số thực.
- Đầu vào: 3 số nguyên a, b, c
- Đầu ra: Số nhỏ nhất trong 3 số
Ví dụ:
Đầu vào : a =1, b=2, c=3
Đầu ra: min =1
*Lưu ý: Không sử dụng các thuật toán như trước.
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng Math.
     */
    /*JA3_1_05: Lấy ra ký tự giữa chuỗi
 Viết hàm để hiển thị kí tự ở giữa chuỗi.
- Đầu vào: Một chuỗi có chiều dài > 5
- Đầu ra: Ký tự ở giữa chuỗi
Ví Dụ: "kkcckk". Ký tự giữa chuỗi là: cc.
kkckk
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Nếu độ dài của chuỗi là số lẻ sẽ có hai ký tự ở giữa.
Nếu độ dài của chuỗi chẵn sẽ có một ký tự ở giữa.
     */
    /*
    JA3_1_07: Đếm khoảng trắng trong chuỗi.
    Cho một chuỗi có chiều dài là ngẫu nhiên. Thực hiện viết hàm đếm xem chuỗi
    đó có bao nhiêu khoảng trắng.
Đầu vào: Chuỗi có chiều dài ngẫu nhiên
Đầu ra: Số nguyên.
VD : Tran Van A => Có 3 khoảng trắng
     */
/*
JA3_1_17: Hàm xóa các phần tử có giá trị lẻ
Viết hàm xóa các phần tử có giá trị lẻ trong mảng số nguyên.
- Đầu vào: Một mảng số nguyên
- Đầu ra: Mảng chưa các phần tử chẵn
Ví dụ: int[] arr = {1,2,3,4,5} => {2,4}
Lưu ý: Không sử dụng vòng lặp for.
Ngôn ngữ sử dụng : Java
Yêu cầu làm bài: Xây dựng các hàm để chia nhỏ bài toán
Gợi ý
Gợi ý file source.java
Sử dụng removeIf.
 */
}

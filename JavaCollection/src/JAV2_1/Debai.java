package JAV2_1;

public class Debai {
    /*
Đề bài
Cho một mảng số nguyên gồm n phần tử. Sắp xếp các phần tử chẵn tăng dần,
phần tử lẻ giảm dần
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra: Một mảng mới với các phần tử đã được sắp xếp theo yêu cầu:
phần tử chẵn tăng, phần tử lẻ giảm.
VD: a[]={4,3,5,1,6,8,2} => Hiển thị: a[] = {2,4,6,8,5,3,1}
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source
Sử dụng thuật toán nổi bọt để sắp xếp tuy nhiên:
Kiểm tra xem nếu a[i] và a[j] là số chẵn và a[i]>a[j] thì tiến hành đổi chỗ
 Ngược lại, nếu a[i] và a[j] đều là số lẻ và a[i]<a[j] thì đổi chỗ
Thoát khỏi vòng lặp, các phần tử đã được sắp xếp theo yêu cầu đề bài
Tiến hành việc hiển thị các phần tử của mảng ra màn hình
     */
    /*
    Viết chương trình nhập vào chuỗi họ và tên ở dạng chưa chuẩn hóa,
    hiển thị email theo ví dụ sau: “   NgUyen VaN   An    ”    => AnNV@hvitclan.vn
Đầu vào: 1 chuỗi là họ tên và có dạng chưa chuẩn hóa
Đầu ra: 1 chuỗi là email đã được chuẩn hóa
VD: “   NgUyen VaN   An    ”    => AnNV@hvitclan.vn
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Xóa bỏ khoảng trắng 2 đầu (Sử dụng hàm trim())
Thay thế các khoảng trắng ở giữa các từ bằng 1 khoảng (Sử dụng hàm String.Replace())
Cắt chuỗi thành mảng chứa các họ, đệm, tên (Sử dụng hàm String.split())
Lấy chữ cái đầu của tên để chuyển thành chữ Hoa rồi ghép lại với các chữ cái còn lại
bằng cách ghép chuỗi thông thường
     */
    /*
    Cho một mảng số nguyên n phần tử. Kiểm tra xem mảng có phải mảng đối xứng hay không?
Đầu vào: Một mảng số nguyên gồm n phần tử
Đầu ra : Kiểm tra xem mảng đó có phải mảng đối xứng không? Nếu có in
 ra "La mang doi xung", ngược lại in ra "Khong la mang doi xung"
VD: a[] = {1, 2, 3, 2, 1} => La mang doi xung
       b[] = {1, 4, 4, 1} => La mang doi xung
       c[] = {1, 2, 3, 3, 1} => Khong la mang doi xung
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source
Duyệt từ đầu mảng đến giữa mảng.
Nếu phần từ thứ i khác phần tử thứ n-i-1 thì tăng biến đếm lên 1 đơn vị
Nếu biến đếm bằng 0 thì trả về 1, còn lại trả về 0
     */
}

package JAV2_2;

public class DeBaiJA2 {
    /*
    Cho 1 danh sách các chuỗi sau: Toan, Ly, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa
Viết chương trình biến đổi danh sách trên thành một Array sau đó in Array đó ra màn hình
Đầu vào: Cho danh sách chuỗi
Đầu ra: In ra mảng chuỗi
VD: List = [Toan, Ly, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa]
 => Array ={Toan, Ly, Hoa, Van, Anh, Toan Cao Cap, Sinh Hoa}
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
sử dụng phương thức list.add() và list.toArray()
     */
    /*
    Cho danh sách các chuỗi.
Viết chương trình thay thế phần tử tất cả phần tử X trong danh sách trên thành Y
Đầu vào: Danh sách chuỗi và X, Y
Đầu ra: Danh sách chuỗi sau khi thay thế: ....
Vd: Danh sách chuỗi "one Two three Four five six one three Four" và phần tử "one", "ten"
     => Danh sách chuỗi sau khi thay thế: "ten three Four five six ten three Four"

Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Sử dụng phương thức replaceAll()
     */
    /*
    Viết chương trình tạo 1 set bất kỳ thực hiện thêm 1 vài phần tử cho
    set vừa tạo sau đó hiển thị kích cỡ của set và từng phần tử của set vừa tạo ra màn hình
Đầu vào: 1 set bất kì
Đầu ra: Hiển thị kích cỡ và từng phần tử của set đó
VD: set = {1,2,3,4,5} => size = 5
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
sử dụng phương thức collection.add() để thêm dữ liệu mới
và collection.size() để lấy kích cỡ Collection
     */
    /*
    Khởi tạo 1 Set sau đó thêm phần tử vào Set vừa tạo, thêm thử các phần tử
    giống nhau và khác nhau để thấy set loại các phần tử trùng lặp
Đầu vào: 1 set và thêm các phần tử vào set
Đầu ra: Hiển thị set ra ngoài màn hình
VD : Set A = [4,2,3,4,5,5,6] => A : [2,3,4,5,6]
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
khởi tạo 1 set theo kiểu dữ liệu nào đó như String hay int
dùng hàm add thêm 1 vài giá trị (string hoặc int vào set)
VD:
HashSet<String> set=new HashSet();
set.add("One");
set.add("Two");
set.add("Three");
set.add("Three");
set.add("Three");
     */
    /*
    Cho 1 Set bất kì. Viết chương trình kiểm tra set trên có rỗng hay không?
Đầu vào: Cho Set bất kì
Đầu ra: In ra màn hình Set có rỗng hay không
VD: Set ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"] => "Set có phần tử"
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Sử dụng hàm isEmpty để kiểm tra
     */
    /*
    Cho set sau: ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"] và
    chuỗi s = "Hvit". Viết chương trình sử dụng hàm contains để kiểm
    tra chuỗi s có chứ trong set trên không?
Đầu vào: Set  ["Cam", "Quyt", "Mit", "Dua", "Le", "Tao", "Oi"] và chuỗi s
Đầu ra: Chuỗi s không chứa trong set
     */
    /*
    Cho 2 hash map sau: map1 { K, V: 1 - Red, 2 - Green, 3 - Blue } và map2 { K, V: 4 - White, 5 - Black, 6 - Orange }.
Viết chương trình thêm toàn bộ phần tử map thứ nhất sang map thứ hai

Đầu vào: Map1 và Map2

Đầu ra: In ra Map2 sau khi thêm toàn bộ phần tử từ Map1
VD: map1 { K, V: 1 - Red, 2 - Green, 3 - Blue } và
map2 { K, V: 4 - White, 5 - Black, 6 - Orange }.
     => { K, V: 1 - Red, 2 - Green, 3 - Blue, 4 - White, 5 - Black, 6 - Orange }
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Khởi tạo 2 map
Tiến hành thêm 1 vài phần tử vào map thứ nhất
Sử dụng hàm put all đưa hết các phần tử đó sang map 2
     */
    /*
Cho List T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. Viết chương trình xáo trộn list T
sau đó hiển thị lại list T ra màn hình
Đầu vào: List T
Đầu ra: List T sau khi xáo trộn
VD: List T : { 1, 4, 7, 8, 9, 6, 3, 2, 5 } =>
List T sau khi xáo trộn: {4, 2, 8, 1, 7, 9, 6, 5, 3}
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Dùng hàm shuffle với list để thay đổi vị trí các phần tử so với lúc khởi tạo
     */
    /*
    Cho list T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }.
    Viết chương trình hiển thị từng phần tử của list T theo vị trí của nó
Đầu vào: Cho List T
Đầu ra: In ra theo định dạng Vị trí - Giá trị
VD : List T = { 1, 4, 7, 8, 9, 6, 3, 2, 5 } =>
Vị trí - Giá trị: 0-1, 1-4, 2-7, 3-8, 4-9, 5-6, 6-3, 7-2, 8-5
     */
    /*
    Cho list T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }.
Viết chương trình đảo ngược lại list T
Đầu vào: List T
Đầu ra: List T đảo ngược
VD: Cho T = { 1, 4, 7, 8, 9, 6, 3, 2, 5 } =>
List T đảo ngược : { 5, 2, 3, 6, 9, 8, 7, 4, 1}
     */
    /*
    Cho danh sáchC có các chuỗi sau: Cam, Quyt, Mit, Dua, Dua, Le, Tao, Oi
Viết chương trình tìm kiếm vị trí xuất hiện đầu tiên và cuối cùng của phần
tử "Dua" trong danh sách C
Đầu vào: danh sách C, phần tử bất kỳ
Đầu ra: Vị trí đầu tiên và cuối cùng của phần tử lần lượt là ....
VD: C có các chuỗi sau: Cam, Quyt, Mit, Dua, Dua, Le, Tao, Oi, phần tử "Dua"
   => Vị trí đầu tiên và cuối cùng của phần tử "Dua" lần lượt là 3 và 4
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Sử dụng phương thức lastIndexOf().
lastIndexOf sẽ trả về chỉ số xuất hiện cuối cùng của phần tử đó trong ArrayList,
ngược lại nếu không tìm thấy trả về -1.
Phương thức indexOf(). Kết quả của phương thức này sẽ trả về chỉ số xuất hiện
đầu tiên của phần tử đó trong ArrayList, ngược lại nếu không tìm thấy trả về -1.
     */
    /*
Cho List T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }.
Viết chương trình xóa phần tử thứ 3 trong list T
Đầu vào: List T
Đầu ra: List T sau khi xóa phần tử thứ 3 : { 1, 4, 7, 9, 6, 3, 2, 5 }
VD: List T: { 1, 4, 7, 8, 9, 6, 3, 2, 5 } =>
List T sau khi xóa phần tử thứ 3 : { 1, 4, 7, 9, 6, 3, 2, 5 }
     */
    /*
    Cho list T sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }.
    Viết chương trình tìm GTLN và GTNN trong list T
Đầu vào: List T
Đầu ra: GTLN và GTNN
VD: List T: { 1, 4, 7, 8, 9, 6, 3, 2, 5 } => Max = 9 và Min = 1
     */
    /*
    Cho danh sách C sau: { "Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi" }.
    Viết chương trình sắp xếp các chuỗi trên theo thứ tự bảng
    chữ cái từ a -> z sau đó in danh sách C ra màn hình
Đầu vào: Collection C
Đầu ra: In ra Collection C sau khi sắp xếp
VD: C = { "Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi" }.
 => C sau khi sắp xếp : { "Cam", "Dua", "Dua", "Le", "Mit", "Oi", "Quyt", "Tao" }
     */
/*
JA2_2_13: Duyệt danh sách bằng iterator
Cho danh sách C , viết chương trình sử dụng iterator để hiển thị danh sách trên
Đầu vào: danh sách C
Đầu ra: Hiển thị danh sách đó đã được sử dụng iterator
VD: {1,2,3,4,5}
 => {1,2,3,4,5}
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source
VD:  khởi tạo 1 mảng bằng HashSet, ArrayList, LinkedList (bất cứ định dạng nào của collection)
add vào mảng đó 1 vài giá trị, duyệt qua mảng đó với iterator kết hợp vòng lặp while
Iterator<String> it = mangDaDuocThemVaiPhanTu.iterator();
    while(it.hasNext()) {
      String value = it.next();
      System.out.println(value);
     }
 */
    /*
    JA2_2_16: Duyệt ngược bằng Iterator
Cho collection C sau: { 1, 4, 7, 8, 9, 6, 3, 2, 5 }.
Viết chương trình hiển thị các phần tử theo thứ tự từ cuối lên đầu sử dụng Iterator
Đầu vào: Collection C
Đầu ra: In ra Collection C đảo ngược
VD: C = { 1, 4, 7, 8, 9, 6, 3, 2, 5 }. => Collection C đảo ngược : { 5, 2, 3, 6, 9, 8, 7, 4, 1}
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source
Sử dụng phương thức hasPrevious()
     */
    /*
    JA2_2_21: Xóa phần tử trong set
    Viết chương trình khởi tạo 2 set từ 2 mảng kiểu số nguyên, thực hiện các yêu cầu sau:
Thêm vào mỗi set một vài phần tử
Xóa 1 phần tử của set bằng hàm remove,
Xóa mọi phần tử của set B nếu phần tử đó cũng tồn tại trong set A bằng hàm remove all
Xóa mọi phần tử của set bằng hàm clear
Đầu vào : 2 set số nguyên
Đầu ra : In ra setA sau khi xóa 1 phần tử
In ra setA sau khi xóa mọi phần tử của setB trong setA
In ra setA sau khi xóa mọi phần tử bằng hàm clear
VD SetA =[1,3,4,5] và SetB = [1, 4 ] => SetA :[1,3,4,5] - SetA: [5] - SetA: []
     */
    /*
    JA2_2_24: Tìm tập hợp giao của 2 tập hợp
    Cho 2 mảng sau, arr1= [ 1, 2, 5, 0, 6, 7] và arr2 = [ 0, 9, 7, 5, 3, 8].
Viết chương trình chuyển 2 mảng thành 2 set và tìm các phần tử chung của 2 set đó
Đầu vào: set1 và set2
Đầu ra: phần tử chung của 2 set là: ...
VD: arr1= [ 1, 2, 5, 0, 6, 7] và arr2 = [ 0, 9, 7, 5, 3, 8].
=> phần tử chung của 2 set là: 0, 5, 7
     */
    /*
    JA2: Sắp xếp danh sách chuỗi
Cho danh sách C sau: { "Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi" }.
Viết chương trình sắp xếp các chuỗi trên theo thứ tự bảng chữ cái từ
a -> z sau đó in collection C ra màn hình
Đầu vào: Collection C
Đầu ra: Collection sau khi sắp xếp : { "Cam", "Dua", "Dua", "Le", "Mit", "Oi", "Quyt", "Tao" }
VD: { "Cam", "Quyt", "Mit", "Dua", "Dua", "Le", "Tao", "Oi" } =>
{ "Cam", "Dua", "Dua", "Le", "Mit", "Oi", "Quyt", "Tao" }
     */
    /*
    JA2_2_28: Xóa bỏ phần tử trong map bằng key
 Cho hash map HM sau: { Key, Value: 1 - Red, 2 - Green, 3 - Blue }.
Viết chương trình xóa phần tử có key = 1 trong HM sau đó hiển thị lại hash map
Đầu vào: HashMap HM
Đầu ra: In ra HM sau khi xóa phần tử có key = 1
VD: HM : { Key, Value: 1 - Red, 2 - Green, 3 - Blue }.
  => HM sau khi xóa phần tử có key = 1: { Key, Value: 2 - Green, 3 - Blue }
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Sử dụng hàm remove()
     */
    /*
    JA2_2_27: Kiểm tra 1 key có tồn tại trong map
Cho hash map HM . Viết chương trình kiểm tra trong hashmap trên có chứa key bất kỳ hay không?
Đầu vào: HashMap HM và 1 key bất kì
Đầu ra: In ra HM có chứa key đó không?
VD : HM : { K, V: 1 - Red, 2 - Green, 3 - Blue } và key = 4 => Không chứa key = 4
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Dùng hàm containsKey kiểm tra
     */
    /*
    Cho 1 hashMap, tiến hành thêm vào hashMap các phần tử có key và
    value lần lượt là: ("Viet Nam", "Ha Noi"), ("Hoa Ky", "Washington, D.C"),
    ("Han Quoc", "Seoul"). Viết chương trình hiển thị các phần tử
    của map đó theo nội dung: [Value] là thủ đô của [Key].
Đầu vào: HashMap
Đầu ra: Danh sách thủ đô tương ứng với Quốc gia
Ví dụ: Ha Noi là thủ đô của Viet Nam...
Ngôn ngữ sử dụng: Java
Yêu cầu làm bài: Xử lý bài toán trong hàm main
Gợi ý
Gợi ý file source.java
Sử dụng Iterator để duyệt map
     */
}

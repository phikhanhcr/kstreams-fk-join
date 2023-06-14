bảng `user` có id là `number` ko phải là `object id`
nếu ko đổi tên field _id : mongo_id thì có lỗi chả hiểu kiểu gì

pk.fields (primary key fields) là cấu hình xác định các trường dữ liệu trong bản ghi được sử dụng làm trường khóa chính. Nếu một hoặc nhiều trường được chỉ định trong pk.fields, giá trị của các trường này sẽ được kết hợp để tạo ra khóa chính. Ví dụ: pk.fields=id,timestamp sẽ sử dụng trường id và timestamp để tạo khóa chính.
pk.mode (primary key mode) là cấu hình xác định cách xử lý trường khóa chính. Có các giá trị sau cho pk.mode:
    `none`: Không sử dụng trường khóa chính. Đây là giá trị mặc định.
    `record_key`: Sử dụng trường key của bản ghi làm khóa chính.
    `record_value`: Sử dụng trường value của bản ghi làm khóa chính.
    `record_key+value`: Kết hợp trường key và value của bản ghi để tạo khóa chính.

Nếu ko dùng `extractId`
=> STRUCT is not supported as the document id.
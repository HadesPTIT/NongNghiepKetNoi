package com.warrior.nongnghiepketnoi.constance

import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.newfeeds.Comment
import com.warrior.nongnghiepketnoi.newfeeds.ModelFeed
import java.util.ArrayList

class Const {
    companion object{
        fun populateCommentRecyclerView(): ArrayList<Comment> {
            var modelFeedArrayList = ArrayList<Comment>()
            var modelFeed = Comment(
                1,
                9,
                "http://tiasang.com.vn/Portals/0/DMSTAO%20anh%202.jpg",
                0,
                "Nguyen Van Minh",
                "2 hrs",
                "Bệnh này nhà bạn bị bệnh Chết Nhanh.\n" +
                        "Triệu chứng: \n" +
                        "-Cây tiêu héo rất nhanh, héo mà lá vẫn còn xanh, không kịp chuyển vàng.\n" +
                        "- Trên thân, cành và lá bị thối đen, ướt sũng, nhất là phần sát với mặt đất.\n" +
                        "- Quả, gié quả bị thối đen và rụng gié quả. \n" +
                        "Biện Pháp: \n" +
                        ".Phòng bệnh :\n" +
                        "Bệnh này thường chữa trị không có hiệu quả nên phòng bệnh là quan trọng.",false
            )
            modelFeed.tick = true

            var subComment = ArrayList<Comment>()

            var modelSubCm = Comment(
                1,
                9,
                "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg",
                0,
                "Nguyễn Thị Mai",
                "2 hrs",
                "Cảm ơn chuyên gia",false
            )
            subComment.add(modelSubCm)
            modelSubCm = Comment(
                1,
                9,
                "http://tiasang.com.vn/Portals/0/DMSTAO%20anh%202.jpg",
                0,
                "Nguyen Van Minh",
                "2 hrs",
                "Chúc bạn thành công !",false
            )
            modelSubCm.tick = true
            subComment.add(modelSubCm)
            modelFeed.commentList = subComment
            modelFeedArrayList.add(modelFeed)
            //+==============================


            modelFeed = Comment(
                2, 26,  "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg", 0,
                "Thảo Bùi", "9 hrs", "Hỏi cách phòng và trị bệnh khô lá hồ ti",false
            )
            modelFeedArrayList.add(modelFeed)

            modelFeed = Comment(
                4,
                17,
                "https://znews-photo.zadn.vn/w660/Uploaded/Nphunow/2016_09_29/untitled1472693860.jpg",
                0,
                "Lab Nguyen",
                "20/01/2019 10:20",
                "Anh, Chị cho em hỏi em muốn xin số liệu về tình hình sản xuất hồ tiêu năm 2010 đến nay thì phải làm cách nào. Em có vào mục tìm kiếm nhưng không có tài khoản vậy làm sao em đăng ký được tài khoản để lấy số liệu mà em càn tìm? Xin Anh, Chị hổ trợ giúp em em cảm ơn nhiều"
                ,true  )
            modelFeedArrayList.add(modelFeed)
            return modelFeedArrayList

        }
        fun populateRecyclerView(): ArrayList<ModelFeed> {
            var modelFeedArrayList = ArrayList<ModelFeed>()
            var modelFeed = ModelFeed(
                1,
                9,
                4,
                "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg",
                R.drawable.hotieu,
                "Nguyễn Thị Mai",
                "2 hrs",
                "Xin hỏi các bác Kỹ Sư Triệu chứng đây là bệnh gì và cách khăc phục ạ. ( Cây Hồ Tiêu )",false
            )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                2, 26, 6, "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg", 0,
                "Thảo Bùi", "9 hrs", "Hỏi cách phòng và trị bệnh tụ huyết trùng trên lợn",false
            )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                3,
                17,
                5,
                "https://i.a4vn.com/2018/7/30/hinh-anh-gay-cuoi-gian-di-nhu-nong-dan-cua-mc-quyen-linh-5d67bb.jpg",
                R.drawable.ga_chet_dgln,
                "Lê Lâm",
                "13 hrs",
                "Gà tự nhiên lăn ra chết phải làm sao",true
            )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                4,
                17,
                5,
                "https://znews-photo.zadn.vn/w660/Uploaded/Nphunow/2016_09_29/untitled1472693860.jpg",
                0,
                "Lab Nguyen",
                "20/01/2019 10:20",
                "Anh, Chị cho em hỏi em muốn xin số liệu về tình hình sản xuất rau an toàn trên địa bàn Tp. HCM tờ năm 2010 đến nay thì phải làm cách nào. Em có vào mục tìm kiếm nhưng không có tài khoản vậy làm sao em đăng ký được tài khoản để lấy số liệu mà em càn tìm? Xin Anh, Chị hổ trợ giúp em em cảm ơn nhiều"
          ,true  )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                5,
                17,
                5,
                "https://i.a4vn.com/2018/7/30/hinh-anh-gay-cuoi-gian-di-nhu-nong-dan-cua-mc-quyen-linh-5d67bb.jpg",
                0,
                "Lê Lâm",
                "10/01/2019 01:20",
                "Trước đây công ty em đã nhập thóc giống từ nhật về nhưng đến ngày 30/08/2019 giấy phép nhập khẩu của Cục cho công ty em đã hết hạn, nên em muốn xin gia hạn giấy phép thì phải làm những gì ạ? Và cần những giấy tờ cần thiết gì để gia hạn giấy phép không ạ?"
                    ,false )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                6,
                17,
                5,
                "https://cdnmedia.baotintuc.vn/2017/10/05/12/15/nong-dan.jpg",
                R.drawable.ma,
                "Lê Lâm",
                "06/01/2019 10:20",
                "các chuyên gia cho em hỏi. Nhà em sản xuất mạ khay cấy máy các năm thực hiện vẫn còn tình trạng mạ nép và lửng vậy có cách nào để xử lý hạt giống trước khi ngâm ủ sao cho hiệu quả và dễ làm nhất không ak? e xin chân thành cảm ơn."
           ,true )
            modelFeedArrayList.add(modelFeed)
            return modelFeedArrayList

        }
        fun populateQARecyclerView(): ArrayList<ModelFeed> {
            var modelFeedArrayList = ArrayList<ModelFeed>()
            var modelFeed = ModelFeed(
                2, 26, 6, "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg", 0,
                "Lê Lâm", "9 hrs", "Hỏi cách phòng và trị bệnh tụ huyết trùng trên lợn",false
            )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                3,
                17,
                5,
                "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg",
                R.drawable.cachua,
                "Lê Lâm",
                "13 hrs",
                "Chào chuyên gia. Gia đình tôi trồng cà chua. Hiện nay đang bắt đầu ra hoa. Nay co hiện tượng cây bị chết. Trên thân xuất hiện các vết đen loang loang như vết dầu. Vay tôi muốn hỏi chuyên gia cà chua nhà tôi bị bệnh gì có thể chữa được không. Cảm ơn chuyên gia!",true
            )
            modelFeedArrayList.add(modelFeed)
            modelFeed = ModelFeed(
                4,
                17,
                5,
                "http://kenh14cdn.com/2016/img-20160930-104023-1477075473425.jpg",
                0,
                "Lê Lâm",
                "20/01/2019 10:20",
                "Ở vùng tây nguyên thường là đất đỏ bazan, thì độ PH của đất là bao nhiêu ạ.nếu độ PH trong đất cao hoặc thấp nên dùng những thành phần hoặc những loai phân hóa học tốt hơn hay dùng phân bón sinh học .làm sao vừa để cải thiện độ PH vừa chuyển hóa,trung hòa chất dinh dưỡng cho đất.giờ ngoài thị trương rất nhiều loại phân kem chất lượng .thi mình nên dùng những loai phân nào hiên nay.để cải tạo đất đã trồng cà phê lâu năm và rất nhiều bệnh,nên e muốn phá đi trồng lại mà không biết làm bằng cách nào nên mới nhờ đến sự tư vấn .rất mong nhận được sự tư vấn cũng như câu trả lời sớm nhất\n"
                ,true  )
            modelFeedArrayList.add(modelFeed)
//             modelFeed = ModelFeed(
//                1,
//                9,
//                2,
//                "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg",
//                R.drawable.phong_benh_vai2,
//                "Nguyễn Thị Mai",
//                "2 hrs",
//                "Quả bị chàm đen nhưng không bị rụng, số lượng bị nhiều. Hỏi nguyên nhân và cách khắc phục? Mọi năm quả rất đẹp nhưng năm nay quả gần chín thì trên vỏ quả xuất hiện vết nám, sau đó chuyển sang màu chàm xanh. Hỏi nguyên nhân và cách khắc phục?",false
//            )
//            modelFeed.isTick = true
//            modelFeedArrayList.add(modelFeed)
//
//            modelFeed = ModelFeed(
//                5,
//                17,
//                5,
//                "https://i.a4vn.com/2018/7/30/hinh-anh-gay-cuoi-gian-di-nhu-nong-dan-cua-mc-quyen-linh-5d67bb.jpg",
//                0,
//                "Lê Lâm",
//                "10/01/2019 01:20",
//                "Trước đây công ty em đã nhập thóc giống từ nhật về nhưng đến ngày 30/08/2019 giấy phép nhập khẩu của Cục cho công ty em đã hết hạn, nên em muốn xin gia hạn giấy phép thì phải làm những gì ạ? Và cần những giấy tờ cần thiết gì để gia hạn giấy phép không ạ?"
//                ,false )
//            modelFeedArrayList.add(modelFeed)
//            modelFeed = ModelFeed(
//                6,
//                17,
//                5,
//                "https://i.a4vn.com/2018/7/30/hinh-anh-gay-cuoi-gian-di-nhu-nong-dan-cua-mc-quyen-linh-5d67bb.jpg",
//                R.drawable.ma,
//                "Lê Lâm",
//                "06/01/2019 10:20",
//                "các chuyên gia cho em hỏi. Nhà em sản xuất mạ khay cấy máy các năm thực hiện vẫn còn tình trạng mạ nép và lửng vậy có cách nào để xử lý hạt giống trước khi ngâm ủ sao cho hiệu quả và dễ làm nhất không ak? e xin chân thành cảm ơn."
//                ,true )
//            modelFeedArrayList.add(modelFeed)
            return modelFeedArrayList

        }

    }
}

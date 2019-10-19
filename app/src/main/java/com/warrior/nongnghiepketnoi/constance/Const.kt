package com.warrior.nongnghiepketnoi.constance

import com.warrior.nongnghiepketnoi.R
import com.warrior.nongnghiepketnoi.newfeeds.ModelFeed
import java.util.ArrayList

class Const {
    companion object{
        fun populateRecyclerView(): ArrayList<ModelFeed> {
            var modelFeedArrayList = ArrayList<ModelFeed>()
            var modelFeed = ModelFeed(
                1,
                9,
                2,
                "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg",
                R.drawable.phong_benh_vai2,
                "Nguyễn Thị Mai",
                "2 hrs",
                "Quả bị chàm đen nhưng không bị rụng, số lượng bị nhiều. Hỏi nguyên nhân và cách khắc phục? Mọi năm quả rất đẹp nhưng năm nay quả gần chín thì trên vỏ quả xuất hiện vết nám, sau đó chuyển sang màu chàm xanh. Hỏi nguyên nhân và cách khắc phục?",false
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
                1,
                9,
                2,
                "https://image-us.24h.com.vn/upload/4-2018/images/2018-12-03/1543833238-98-bo-luong-33-ty-ve-lam-nong-dan-7-nam-1-1543758863-width500height333.jpeg",
                R.drawable.phong_benh_vai2,
                "Nguyễn Thị Mai",
                "2 hrs",
                "Quả bị chàm đen nhưng không bị rụng, số lượng bị nhiều. Hỏi nguyên nhân và cách khắc phục? Mọi năm quả rất đẹp nhưng năm nay quả gần chín thì trên vỏ quả xuất hiện vết nám, sau đó chuyển sang màu chàm xanh. Hỏi nguyên nhân và cách khắc phục?",false
            )
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

    }
}

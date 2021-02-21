//格式化
        // 第一种：格式化DATE对象成STRING类型日期格式
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date = new Date(); //创建日期对象
		System.out.println("date: " + date);
		
		String formatedDate = sdf.format(date); //格式化日期对象
		System.out.println("formatedDate: " + formatedDate);
        
        // 第二种：把字符串转成日期对象后再格式化
        String str = "2012/11/25 11:09:53";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		Date date = new Date();
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
            System.out.println("Invalid format")
		}
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM-dd-yyyy");
		String formattedDate = sdf2.format(date);
		System.out.println(formattedDate);

//默认创建日期时间
created_at Timestamp DEFAULT current_timestamp

/*
    常用日期符号
    年：yy | yyyy
    月：MM | MMM (缩写月份) | MMMM
    日：dd
    时：HH (24小时) | hh (12小时)
    分：mm
    秒: ss
    区域：z/Z
    a: am/pm
    日期：EEE (缩写) | EEEE (全称) 如星期一，Thursday, Thu
*/

/*
    时间的计算 (Java 8)

*/
LocalDate ld = LocalDate.now(); //创建日期对象

LocalDate dob = LocalDate.parse("30/11/2020", DateTimeFormatter.ofPattern("dd/MM/yyyy")); //把字符串解析成日期对象

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd"); //创建一个格式化对象

dtf.format(dob); //格式化dob

P
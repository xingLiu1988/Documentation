RequestDispatcher rdis = request.getRequestDispatcher("resources/html/somepage.html"); //通过dispatcher跳转到本地其他页面

RequestDispatcher rdis = request.getRequestDispatcher("/dirserv"); //通过dispatcher跳转到其他servlet

rdis.forward(request, response); //开始跳转
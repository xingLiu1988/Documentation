/*
    什么是HttpSession:
        1. 用于保存用户信息，将来再次访问页面的时候不需要再次输入账号密码

    实现步骤：
        1. 获取用户信息
        2. 创建Session
        3. 设置Session
*/

// 第一步 获取用户信息
String name = request.getParameter("name");
String superpower = request.getParameter("superpower");
int bounty = Integer.parseInt(request.getParameter("bounty"));
SuperVillain tempVillain = new SuperVillain(name, superpower, bounty);

// 第二步 创建Session
HttpSession session = request.getSession();

// 第三部 设置Session
session.setAttribute("villain", tempVillain);

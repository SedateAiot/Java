分类分包操作

1.客服接待 -- StudentController
    将用户输入的信息封装为学生对象（传递给业务员StudentService）

2.业务员 -- StudentService

做业务处理，例如输入的ID是否存在，将接受到的学生对象传递给仓库管理员StudentDAO

3.库管StudentDAO

库管需要创建Student学生数组长度为5，将接受到的学生对象添加到数组中，返回布尔值


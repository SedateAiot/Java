<h2>分类分包操作</h2>

1. 客服接待 -- StudentController
    将用户输入的信息封装为学生对象（传递给业务员StudentService）

2. 业务员 -- StudentService

做业务处理，例如输入的ID是否存在，将接受到的学生对象传递给仓库管理员StudentDAO

3. 库管StudentDAO

库管需要创建Student学生数组长度为5，将接受到的学生对象添加到数组中，返回布尔值

static关键字 --- 静态

可以修饰成员方法和变量，给类的成员和方法共享数据，可以通过类名调用

静态方法只能访问静态成员（带static的成员）；且没有this关键字，因为this需要创建关键字之后才能存在


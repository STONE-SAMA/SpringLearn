package org.example.ba02;

import org.springframework.stereotype.Component;

/**
 * @Component创建对象，等同于<bean>的功能
 * 属性：value为对象的名称，即bean的id
 *      value的值唯一，创建对象在spring容器中就一个
 * 位置：在类上方
 *
 *
 * 1、@Repository（用在持久层）：位于dao的实现类上面，表示创建dao对象
 * 2、@Service（用在业务层）：位于service的实现类上面，表示创建service对象
 * 3、@Controller（用在控制器）：位于控制器类上面，创建控制器对象，控制器对象能够接受用户提交的参数，显示请求结果
 * 以上三个注解都能创建对象，但也有其他功能
 *
 *
 */
//value可以省略。若不指定名称，则默认为类名小写形式
@Component(value = "myStudent")
public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

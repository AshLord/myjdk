package java.lang.annotation;

public enum ElementType {

    TYPE,//类 接口 注解 枚举
    FIELD,//全局静态变量
    LOCAL_VARIABLE,//局部变量
    PARAMETER,//方法入参
    METHOD,//函数
    CONSTRUCTOR,//构造函数
    ANNOTATION_TYPE,//注解
    PACKAGE,//包
    TYPE_PARAMETER,//类型参数 @since 8
    TYPE_USE,//类型使用 @since 8
    MODULE//模块 @since 9

}

# Java-MutexFlag-Class
一个类似于Windows中Mutex信号量的Java同步工具类

com.choi.MutexFlag 是个线程同步中的工具类，能通过调用getMutexFlag(),和freeMutexFlag()实现对代码的同步，并支持嵌套锁，类似

{
getMutexFlag();
...
getMutexFlag();
...
freeMutexFlag();
...
freeMutexFlag();
}

这种使用方式。

由于写这个类的时候是编写博客边写代码完成的，博客中包含了编写这个工具类的思考过程，所以，这里不再赘述了。想要了解的欢迎阅读我的
cnblos博客：http://www.cnblogs.com/chaiwentao/p/4680836.html

# NT-Eureka-Server-Cluster
Spring cloud eureka服务的集群示例目.
### **配置**:
```
需要配置/etc/hosts(mac系统)文件
127.0.0.1 discovery1
127.0.0.1 discovery2
127.0.0.1 discovery3
```

### **启动方法**:  
```
1）在nt-eureka-server-cluster目录下，使用mvn package打包项目
2）使用下面命令启动两个Eureka Server节点
nohup java -jar nt-eureka-server-cluster.jar --spring.profiles.active=discovery1 > /dev/null 2>&1 &

nohup java -jar nt-eureka-server-cluster.jar --spring.profiles.active=discovery2 > /dev/null 2>&1 & 
ls

3）在浏览器上分别输入http://discovery1:8761和http://discovery2:8762查看注册的服务。
```
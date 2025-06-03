# fly

根据新版本和一些新的思考做一些新的测试和实现 。

# 参考文档

* https://github.com/alibaba/spring-cloud-alibaba/blob/2023.x/README-zh.md
* https://java2ai.com/docs/1.0.0-M6.1/concepts/?spm=4347728f.33449ac1.0.0.6f68556b27wBu1
* https://github.com/nacos-group/nacos-docker/blob/master/example/standalone-mysql.yaml
* https://sca.aliyun.com/docs/2023/overview/version-explain/?spm=5238cd80.47ee59c.0.0.189fcd36D6yMOA
* https://github.com/apache/incubator-seata/tree/develop/script/server/db
* https://seata.apache.org/zh-cn/docs/ops/deploy-by-docker-compose/#nacos-db

rabbitmq

* https://cloud.tencent.com/developer/article/2354446


```shell
docker exec -it rabbitmq /bin/bash -c "rabbitmq-plugins enable rabbitmq_delayed_message_exchange"
```
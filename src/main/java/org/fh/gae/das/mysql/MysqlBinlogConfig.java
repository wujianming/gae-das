package org.fh.gae.das.mysql;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "das.mysql")
@Data
@NoArgsConstructor
public class MysqlBinlogConfig {
    private String host = "localhost";

    private Integer port = 3306;

    private String username = "root";

    private String password = "";

    /**
     * binlog文件名
     */
    private String binlogName = "";

    /**
     * binlog偏移量
     */
    private Long position = -1L;
}

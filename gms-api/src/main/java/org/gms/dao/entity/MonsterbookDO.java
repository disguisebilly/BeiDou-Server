package org.gms.dao.entity;

import com.mybatisflex.annotation.Id;
import com.mybatisflex.annotation.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 *  实体类。
 *
 * @author sleep
 * @since 2024-05-24
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("monsterbook")
public class MonsterbookDO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Integer charid;

    @Id
    private Integer cardid;

    private Integer level;

}
package org.starcoin.swap.entity;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "swap_day_stat")
public class SwapStat {
    @Id
    @Column(name = "stat_date")
    @JSONField(name = "timestamp")
    private Date statDate;
    @Column(name = "volume")
    private BigDecimal volume;
    @Column(name = "tvl")
    private BigDecimal tvl;

    public Date getStatDate() {
        return statDate;
    }

    public void setStatDate(Date statDate) {
        this.statDate = statDate;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getTvl() {
        return tvl;
    }

    public void setTvl(BigDecimal tvl) {
        this.tvl = tvl;
    }
}

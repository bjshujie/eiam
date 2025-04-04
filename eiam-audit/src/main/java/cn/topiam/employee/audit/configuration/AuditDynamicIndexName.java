/*
 * eiam-audit - Employee Identity and Access Management
 * Copyright © 2022-Present Jinan Yuanchuang Network Technology Co., Ltd. (support@topiam.cn)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cn.topiam.employee.audit.configuration;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import cn.topiam.employee.support.autoconfiguration.SupportProperties;
import static cn.topiam.employee.support.constant.EiamConstants.DEFAULT_DATE_FORMATTER_PATTERN;

/**
 * ElasticsearchConfiguration
 *
 * @author TopIAM
 * Created by support@topiam.cn on  2022/11/3 23:31
 */
public class AuditDynamicIndexName {

    private final SupportProperties supportProperties;

    public AuditDynamicIndexName(SupportProperties supportProperties) {
        this.supportProperties = supportProperties;
    }

    /**
     * 获取索引
     *
     * @return {@link String}
     */
    public String getIndexName() {
        return supportProperties.getAudit().getIndexPrefix() + LocalDate.now()
            .format(DateTimeFormatter.ofPattern(DEFAULT_DATE_FORMATTER_PATTERN));
    }
}

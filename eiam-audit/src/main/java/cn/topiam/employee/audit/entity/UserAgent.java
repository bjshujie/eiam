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
package cn.topiam.employee.audit.entity;

import java.io.Serializable;

import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserAgent
 * @author TopIAM
 * Created by support@topiam.cn on  2022/11/5 23:31
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAgent implements Serializable {

    @Field(type = FieldType.Keyword, name = "device_type")
    private String deviceType;

    @Field(type = FieldType.Keyword, name = "platform")
    private String platform;

    @Field(type = FieldType.Keyword, name = "platform_version")
    private String platformVersion;

    @Field(type = FieldType.Keyword, name = "browser")
    private String browser;

    @Field(type = FieldType.Keyword, name = "browser_type")
    private String browserType;

    @Field(type = FieldType.Keyword, name = "browser_major_version")
    private String browserMajorVersion;
}

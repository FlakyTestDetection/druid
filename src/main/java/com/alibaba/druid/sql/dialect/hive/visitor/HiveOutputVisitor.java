/*
 * Copyright 1999-2017 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.druid.sql.dialect.hive.visitor;

import com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement;
import com.alibaba.druid.sql.ast.statement.SQLExprTableSource;
import com.alibaba.druid.sql.ast.statement.SQLSelect;
import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;

import java.util.List;

public class HiveOutputVisitor extends SQLASTOutputVisitor implements HiveASTVisitor {
    public HiveOutputVisitor(Appendable appender) {
        super(appender);
    }

    public HiveOutputVisitor(Appendable appender, String dbType) {
        super(appender, dbType);
    }

    public HiveOutputVisitor(Appendable appender, boolean parameterized) {
        super(appender, parameterized);
    }
}

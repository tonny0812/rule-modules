package com.ciana.rule.engine.node.data;

import java.util.Map;

import com.ciana.rule.engine.parse.entity.RuleNode;

/**
 * 自定义实现接口
 * @author admin
 *
 */
public class IntfRuleDataImpl implements RuleDataInterface {

	@Override
	public Map<String, Object> getData(RuleNode node, Map<String, Object> lastParams) throws Exception {
		Class cls = Class.forName(node.getIntfname());
		RuleDataInterface def = (RuleDataInterface) cls.newInstance();
		return def.getData(node, lastParams);
	}

}

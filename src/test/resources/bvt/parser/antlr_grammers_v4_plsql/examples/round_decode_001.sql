	SELECT 
	nvl(
	a.attribute_str_value,
	round(
	decode(
	a.attribute_name, n.col,
	a.attribute_num_value * n.scale + n.shift,
	a.attribute_num_value), 4
	)
	) val
	from employees
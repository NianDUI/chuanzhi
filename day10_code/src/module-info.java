
module demo {
	// 如果其他模块依赖我，那么其他模块下面的2个包都可以访问
	exports demo01;
	exports demo02Stream;
	
	// 依赖  名称为module的名称，而不是报名
	requires book;// 再在工程Build Path->最后一个-》project-》moduole-》add
}
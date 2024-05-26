
module Java_9_Features_Module_1 {
	exports java_9_features.module1; // this will export to all
	//qualified export
	exports java_9_features.encrypt to Java_9_Features_Module_3; // this will export to specific
}
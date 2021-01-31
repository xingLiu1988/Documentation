/*
    Docs:
        学习的最佳方式：把重要的知识点归纳并集中在一起，集中复习，省去大量时间去查找相关资料
        组件：TouchableWithoutFeedback
        用途：在表单中，点击键盘之外区域能够隐藏键盘
        用法：在页面的最外层套入TouchableWithoutFeedback组件
*/
import {TouchableWithoutFeedback, Keyboard} from 'react-native';

<TouchableWithoutFeedback onPress={() => Keyboard.dismiss()}>
    <View>
        
    </View>
</TouchableWithoutFeedback>
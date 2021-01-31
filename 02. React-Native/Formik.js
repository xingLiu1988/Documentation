/* 
    Docs:
        学习的最佳方式：把重要的知识点归纳并集中在一起，集中复习，省去大量时间去查找相关资料
        web: https://www.npmjs.com/package/formik

    Steps:
        Step 1: npm i formik yup
        
        Step 2: 
            import { Formik } from 'formik';
            import * as yup from 'yup';
        Step 3: create a formik form
        
        Step 4: add some styles to input
            input: {
                
            }
        Step 5: define schema
            const reviewSchema = yup.object({
                title: yup.string().required().min(4),
                body: yup.string().required().min(8),
                rating: yup.string().required().test('is-num-1-5', 'Rating must be a number 1 -5', (val) => {
                    return parseInt(val) < 6 && parseInt(val) > 0
                })
            })
*/
<Formik 
    // 初始化数据
    initialValues={{title: '', body: '', rating: ''}}
    // 验证
    validationSchema={reviewSchema}
    // 当用户提交数据时
    onSubmit={(values, actions)=> {
        // values 修改后的数据
        // actions formik提供的对象，包含的一些方法 
        // 重置数据
        actions.resetForm();
    }}
>
    {/* props对象，包含了一堆方法和属性供使用 */}
    {(props)=> (
        <View>

            <TextInput 
                style={globalStyles.input}
                placeholder='Review title'
                // 更新title
                onChangeText={props.handleChange('title')}
                value={props.values.title}
                // 实时判断，当输入完成，离开焦点马上判断
                onBlur={props.handleBlur('title')}
            />
            {/* 当输入后提交才判断是否验证成功 */}
            <Text>{props.touched.title && props.errors.title}</Text>

            <TextInput 
                multiline
                style={globalStyles.input}
                placeholder='Review body'
                onChangeText={props.handleChange('body')}
                value={props.values.body}
                onBlur={props.handleBlur('body')}
            />
            <Text>{props.touched.body && props.errors.body}</Text>

            <TextInput 
                style={globalStyles.input}
                placeholder='Rating (1-5)'
                onChangeText={props.handleChange('rating')}
                value={props.values.rating}
                onBlur={props.handleBlur('rating')}
                // 使用数字键盘
                keyboardType='numeric'
            />
            <Text>{props.touched.rating && props.errors.rating}</Text>

            <Button title='submit' color='black' onPress={props.handleSubmit} />
        </View>
    )}
</Formik>
    
        

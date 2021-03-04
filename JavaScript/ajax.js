// 获取元素
let button = document.querySelector("#btn");
let searchId = document.querySelector("#searchId");
let input = document.querySelector("#input");

// 添加事件
button.addEventListener("click", ajaxCall);

//ajax
function ajaxCall(){
    let number = searchId.value;

    // STEP 1 创建异步请求
    let xhr = new XMLHttpRequest();

    // STEP 2 判断数据接收进度
    xhr.onreadystatechange = function(){
        if(this.readyState == 4 && this.status == 200) {
            let data = JSON.parse(xhr.responseText);
            console.log(data);
            console.log(data.name);
            renderHTML(data);
        }
    }

    //STEP 3 开始数据请求
    xhr.open('GET', `https://pokeapi.co/api/v2/pokemon/${number}`);

    //STEP 4 发送
    xhr.send();
}
function renderHTML(data){
    input.append("Name: " + data.name);
    input.append(document.createElement("br"));

    let image = document.createElement("img");
    image.setAttribute('src', data.sprites.front_default);
    image.setAttribute('height', '300');
    image.setAttribute('width', '300');
    input.append(image);
    input.append(document.createElement("br"));
}
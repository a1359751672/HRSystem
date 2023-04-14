//页面加载时间获取
$(function (){
    //为提交按钮添加点击事件
    $("#btnSubmit").click(function (){
        console.log(new FormData($("#addAddressFrom")[0]))
        $.ajax({
            "url":"/ask/createAsk",
            "data":$("#addAddressFrom").serialize(),
            "type":"post",
            "dataType":"json",
            "success":function (json){
                if (json.state==1000){
                    alert("添加成功")
                }else {
                    alert(json.msg)
                }
            }
        })
    })
})

function appendList(parent,sid){
//    发送ajax请求
    $.ajax({
        "url":"/districts/",
        "data":"parent="+parent,
        "type":"get",
        "dataType":"json",
        "success":function (json){
        //    获取列表的数据
            var list =json.data
        //    遍历数组
            for(var i=0;i<list.length ;i++){
                //遍历获取到的option的选择值
               var option = "<option value='"+list[i].code+"'>"+list[i].name+"</option>"
            //将option添加到对应的是select的内部，作为下拉框的选择值
            $("#"+sid).append(option)
            }
        },
    })
}
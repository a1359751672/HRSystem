var meritsUrl="/merits/create"

$(function () {
    //为提交按钮添加点击事件
    $("#btn-merits").click(function (){
        //    获取表单数据
        var mdate = new Date($("#mdate").val());
        var jnum =$("#jnum").val();
        var deptId = $("#dept_id").val();
        var att =$("#att").val();
        var manner =$("#manner").val();
        var abi =$("#abi").val();

// //    判断页面中的input是否都进行了验证
//         var divArr = $("div.has-success");
//         if (divArr.length != 3){
//             return;
//         }
        //    提交表单
        var params = { //提交参数，请求参数属性名=属性值（属性名需和后端一致）
            mdate:mdate,
            jnum:jnum,
            deptId:deptId,
            att:att,
            manner:manner,
            abi:abi,
        }
        //    发送AJAX请求
        $.post(meritsUrl,params,function (result) {
            //    处理相应数据
            if (result.state == 1000){ //相应成功状态
                    alert("修改考勤成功");
                }else{
                    alert(result.msg);
                }
        })

    })
})

// //    定义验证是否为空方法
// function checkEmpty(name,msg){
//     if ($("#"+name).val() ==""){
//         $("#"+name).parents(".form-group").addClass("has-error").removeClass("has-success");
//         //    给span标签添加错误提示信息
//         $("#"+name).next("span").text(msg);
//         return false;
//     }else {
//         $("#"+name).parents(".form-group").removeClass("has-error").addClass("has-success");
//         //
//         $("#"+name).next("span").text("");
//         return true;
//     }
// }
var template = "<tr>" +
    "<td>[mdate]</td>" +
    "<td>[name]</td>" +
    "<td>[jnum]</td>" +
    "<td>[dept_name]</td>" +
    "<td>[att]</td>" +
    "<td>[manner]</td>" +
    "<td>[abi]</td>" +
    // "<td><a aid='[aid]'  id='modifiedContent' href='addmerits.html?id=[aid]' class='btn btn-xs btn-info'><span class='fa fa-edit'></span> 修改</a></td>" +
    // "<td><a aid='[aid]' class='btn btn-xs add-del btn-info btn-delete'><span class='fa fa-trash-o'></span> 删除</a></td>" +
    // "<td><a aid='[aid]' class='btn btn-xs add-def btn-default'>设为默认</a></td>" +
    "</tr>"
var meritsLis = "/merits/list"

$(function (){
    listMerits();
})

//查询用户地址信息
function listMerits() {
    axios.get(meritsLis, function (result) {
        if (result.state == 1000) {
            for (var index in result.data) {
                var addr = result.data[index]
                var td = template.replace("[mdate]", addr.mdate)
                    .replace("[name]", addr.name)
                    .replace("[jnum]", addr.jnum)
                    .replace("[dept_name]", addr.deptName)
                    .replace("[att]", addr.att)
                    .replace("[manner]", addr.manner)
                    .replace("[abi]", addr.abi)
                    // .replace(/\[aid\]/g, addr.id)
                var tobj = $(td)
                var btnDefault = tobj.find(".btn-default")
                if (addr.isDefault == 1) {
                    btnDefault.remove()
                }
                $("#tbody").append(tobj)
            }
        } else {
            alert(result.msg)
        }
        //为删除按钮添加点击事件
        $(".btn-delete").bind("click", function () {
            var flag = confirm("确定要删除此地址吗?")
            if (flag == false) {
                return
            }
//    获取地址id
            var id = $(this).attr("aid");
            params = {
                id: id,
            }
//    发送请求
//             $.post(deleteUrl, params, function (result) {
//                 if (result.state == 1000) {
//                     alert("删除成功")
//                     window.location.reload();
//                 } else {
//                     alert(result.msg)
//                 }
//             })
        })

    })
}
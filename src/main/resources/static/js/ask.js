var template = "<tr>" +
    "<td>[userId]</td>" +
    "<td>[name]</td>" +
    "<td>[asktype][askdate][isCheck][address]</td>" +
    "<td>[phone]</td>" +
    "<td><a aid='[aid]' class='btn btn-xs btn-info'><span class='fa fa-edit'></span> 修改</ a></td>" +
    "<td><a aid='[aid]' class='btn btn-xs add-del btn-info'><span class='fa fa-trash-o'></span> 删除</ a></td>" +
    "<td><a aid='[aid]' class='btn btn-xs add-def btn-default'>设为默认</ a></td>" +
    "</tr>"
var addressUrl = "/addresses/list"
$(function (){
    listAddress();
})

//查询用户地址信息
function  listAddress(){
    $.get(addressUrl,function (result){
        if (result.state==1000){
            for (var index in result.data){
                var addr = result.data[index]
                var td = template.replace("[tag]",addr.tag)
                    .replace("[name]",addr.name)
                    .replace("[provinceName]",addr.provinceName)
                    .replace("[cityName]",addr.cityName)
                    .replace("[areaName]",addr.areaName)
                    .replace("[address]",addr.address)
                    .replace("[phone]",addr.phone)
                    .replace(/\[aid\]/g,addr.id)
                var tobj = $(td)
                var btnDefault = tobj.find(".btn-default")
                if (addr.isDefault == 1){
                    btnDefault.remove()
                }
                $("#tbody").append(tobj)
            }
        }else {
            alert(result.msg)
        }
    })
}

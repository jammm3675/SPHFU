function showBuildingMap() {
    hideAll();
    document.getElementById('building-map').classList.remove('hidden');
}

function showCampus() {
    hideAll();
    document.getElementById('groups').classList.remove('hidden');
}

function showSchedule() {
    hideAll();
    document.getElementById('schedule').classList.remove('hidden');
}

function showSettings() {
    hideAll();
    document.getElementById('settings').classList.remove('hidden');
}

function hideAll() {
    document.getElementById('building-map').classList.add('hidden');
    document.getElementById('schedule').classList.add('hidden');
    document.getElementById('groups').classList.add('hidden');
    document.getElementById('settings').classList.add('hidden');
}

function findPath() {
    alert("Функция поиска пути в разработке.");
}

function filterSchedule(week) {
    alert("Фильтрация расписания для " + week);
}

function filterGroups(type) {
    alert("Фильтрация групп по типу: " + type);
}
